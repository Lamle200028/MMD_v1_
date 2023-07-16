package com.example.tesst.Api

import com.example.tesst.model.BREachDepartment.BREachDepartment
import com.example.tesst.model.DepartmentReponse.DataDepartment
import com.example.tesst.model.Eqiutmentreponsev2.Data.EquitmentId
import com.example.tesst.model.UserLogin.Account
import com.example.tesst.model.Eqiutmentreponsev2.DataEquitment
import com.example.tesst.model.Eqiutmenttreponsev1.Equitment
import com.example.tesst.model.NotificationReponse.DataNotification
import com.example.tesst.model.UserLogin.DataLogin
import com.example.tesst.model.UserReponse.UserReponse.DataUser
import com.example.tesst.model.baohong.data.RequestInfo
import com.example.tesst.model.baohong.data.ResponseData
import com.example.tesst.model.reportInventory.ResultSendInventory
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.X509TrustManager


interface APIservice {

    @POST("/api/login")
    @FormUrlEncoded
    fun getdataUser(@Body account: Account): Call<DataLogin>

    @POST("/api/login")
    @FormUrlEncoded
    fun getdataUser(
        @Field("email") email: String,
        @Field("password") password: String,
    ): Call<DataLogin>

    @POST("/api/v1/createInventory/{id}")
    fun creatInventory(
        @Path("id") id: String,
        @Header("Authorization") token: String
    ): Call<ResultSendInventory>

    @POST("/api/v1/equipment/{id}")
//    @FormUrlEncoded
    fun requestErrorAPI(
        @Path("id") id: String,
//        @Field("date_failure") date_failure: String,
//        @Field("reason") reason: String,
        @Body info: RequestInfo,
        @Header("Authorization") token: String
    ): Call<ResponseData>

    @GET("/api/v2/equipments")
    fun getdatadevice(
        @Header("Authorization") token: String
    ): Call<DataEquitment>

    @GET("/api/v1/equipments")
    fun getdatadevicev1(
        @Header("Authorization") token: String
    ): Call<Equitment>

    @GET("/api/v2/equipments/{id}")
    fun getdatadevicebyid(
        @Path("id") id: String,
        @Header("Authorization") token: String
    ): Call<EquitmentId>

    @GET("/api/v1/departments")
    fun getdataDepartment(
        @Header("Authorization") token: String
    ): Call<DataDepartment>

    @GET("/api/v1/count-broken-and-repairing-equipment-each-department")
    fun getdataBREachDepartment(
        @Header("Authorization") token: String
    ): Call<BREachDepartment>


    @GET("")
    fun getdataEquitmentbyid(): Call<DataDepartment>

    @GET("/api/v1/notification")
    fun getNotification(
        @Header("Authorization") token: String
    ): Call<DataNotification>

    @GET("/api/v1/users")
    fun getUser(
        @Header("Authorization") token: String
    ): Call<DataUser>

}

