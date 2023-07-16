package com.example.tesst.model.NotificationReponse

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoadDataNotification {
    companion object{
        var dataNotification : DataNotification? = null
        fun setdataNotification(token : String){
            ApiServiceFactory.createApiService().getNotification("Bearer $token").enqueue(object : Callback<DataNotification>{
                override fun onResponse(
                    call: Call<DataNotification>,
                    response: Response<DataNotification>
                ) {
                    if (response.isSuccessful){
                        dataNotification = response.body()
                        Log.d("checkk data notification", response.body()?.data?.size.toString())
                    }else {
                        Log.d("checkkk", "thatbai")
                    }

                }

                override fun onFailure(call: Call<DataNotification>, t: Throwable) {
                    Log.d("checkkk", "thatbai")
                }

            })
        }
        fun getdataNotification() : DataNotification?{
            return dataNotification
        }
    }
}