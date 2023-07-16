package com.example.tesst.Api

import com.google.gson.GsonBuilder
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.CertificateException
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLException
import javax.net.ssl.X509TrustManager

object ApiServiceFactory {
        fun createApiService(): APIservice {
            val loggingInterceptor = HttpLoggingInterceptor()
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val apiInterceptor = object : Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    val builder = chain.request().newBuilder()
                        .addHeader("Accept", "application/json")
                        .addHeader("X-CSRF-TOKEN", "")
                    return chain.proceed(builder.build())
                }
            }
            val trustManager = arrayOf(object : X509TrustManager {
                override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                }

                override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {
                    chain?.forEach {
                        try {
                        it.checkValidity()
                    } catch (e: CertificateException) {
                        throw SSLException("SSL certificate is not valid", e)
                    }
                    }
                }

                override fun getAcceptedIssuers(): Array<X509Certificate> {
                    return emptyArray()
                }
            })

// Tạo một SSLContext object và cấu hình nó với TrustManager
            val sslContext = SSLContext.getInstance("TLS")
            sslContext.init(null, trustManager, SecureRandom())

            val client = OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .addInterceptor { chain ->
                    val request = chain.request()
                    val response = chain.proceed(request)
                    if (response.code == 429) {
                        // Lượng truy cập quá mức, xử lý tại đây
                        return@addInterceptor response.newBuilder()
                            .code(400)
                            .message("Too many requests")
                            .body(ResponseBody.create("text/plain".toMediaTypeOrNull(), ""))
                            .build()
                    }
                    response
                }
                .addInterceptor(apiInterceptor)
                .sslSocketFactory( sslContext.socketFactory, trustManager[0])
                .build()
            val gson = GsonBuilder()
                .create()
            val apiservice = Retrofit.Builder()
                .baseUrl("http://bvdemo.qltbyt.com")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
//                    .create(APIservice::class.java)
            return apiservice.create(APIservice::class.java)

        }
}