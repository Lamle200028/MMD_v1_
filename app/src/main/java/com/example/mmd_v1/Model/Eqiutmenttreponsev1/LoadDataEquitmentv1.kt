package com.example.tesst.model.Eqiutmenttreponsev1

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoadDataEquitmentv1 {
        var dataEquitment : Equitment? = null
        var listdevice1 : ArrayList<Device>? = ArrayList()
        var deviceid : Device? = null
        fun setdataEquitmentv1(token: String){
            ApiServiceFactory.createApiService().getdatadevicev1("Bearer $token").enqueue(object :
                Callback<Equitment> {
                override fun onResponse(
                    call: Call<Equitment>,
                    response: Response<Equitment>
                ) {
                    dataEquitment = response.body()
                    listdevice1?.addAll(dataEquitment?.data!!)
                    Log.d("checkkkk equiment", response.body()?.status.toString())
                }

                override fun onFailure(call: Call<Equitment>, t: Throwable) {
                    Log.d("checkkk equitment", "that bai")
                }

            })
        }
        fun getdataEquitmentv1() : Equitment?{
            return dataEquitment
        }
}