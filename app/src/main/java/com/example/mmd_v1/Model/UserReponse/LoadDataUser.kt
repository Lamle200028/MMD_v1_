package com.example.tesst.model.UserReponse.UserReponse

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoadDataUser {
    companion object{
        var datauser : DataUser? = null
        fun setDataUserReponse(token : String){
            ApiServiceFactory.createApiService().getUser("Bearer $token").enqueue(object : Callback<DataUser>{
                override fun onResponse(call: Call<DataUser>, response: Response<DataUser>) {
                    datauser = response.body()
                }

                override fun onFailure(call: Call<DataUser>, t: Throwable) {
                    Log.d("check data user", "thatbai")
                }

            })
        }
        fun getDataUserReponse() : DataUser?{
            return datauser
        }
    }
}