package com.example.tesst.model.reportInventory

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SendReportInventory {
    companion object{
        var resultdata : ResultSendInventory? = null
        fun sendatareportInventory(id : String, token : String){
            ApiServiceFactory.createApiService().creatInventory(id, "Bearer $token").enqueue(object : Callback<ResultSendInventory>{
                override fun onResponse(
                    call: Call<ResultSendInventory>,
                    response: Response<ResultSendInventory>
                ) {
                    resultdata = response.body()
                    Log.d("check sendInventory", resultdata?.message.toString())
                }

                override fun onFailure(call: Call<ResultSendInventory>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
        }
    }
}