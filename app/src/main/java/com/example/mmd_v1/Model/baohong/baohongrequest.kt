package com.example.tesst.model.baohong

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import com.example.tesst.model.baohong.data.RequestInfo
import com.example.tesst.model.baohong.data.ResponseData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class baohongrequest {
    companion object{
        fun sendbroken(id: String, reason : String, date : String, token : String ) {

//            val dateFailure = SimpleDateFormat(date, Locale.getDefault()).format(Date())
            var info = RequestInfo(date, reason)
//            ApiServiceFactory.createApiService().requestErrorAPI (id, date,reason,"Bearer + $token").enqueue(object :
//                Callback<ResponseData> {
//                override fun onResponse(call: Call<ResponseData>, response: Response<ResponseData>) {
//                    // Xử lý response thành công
//                    Log.d("checkk báo hỏng full", response.message())
//                    Log.d("checkk báo hỏng full bdody", response.body()?.status.toString())
//                    if (response.isSuccessful) {
//                        val responseData = response.body()
//                        Log.d("checkk báo hỏng full", "thành công")
////                    val dataRequest = DataRequest(responseData, id, info)
//
//                    } else {
//                        // Xử lý response thất bại
//                        val errorBody = response.errorBody()?.string()
//                        // Xử lý lỗi
//                    }
//                }
//
//                override fun onFailure(call: Call<ResponseData>, t: Throwable) {
//                    Log.d("checkk báo hỏng", "thành công")
//                }
//            })
        }
    }


}