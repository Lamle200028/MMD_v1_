package com.example.tesst.model.Eqiutmentreponsev2

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import com.example.tesst.model.Eqiutmentreponsev2.Data.EquitmentId
import com.example.tesst.model.Eqiutmentreponsev2.Data.dataDevice.Device
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LoadDataEquitment {
        var dataEquitment : DataEquitment? = null
        var listdevice : ArrayList<Device>? = ArrayList()
        var deviceid : Device? = null
        fun setdataEquitment(token: String){
            ApiServiceFactory.createApiService().getdatadevice("Bearer $token").enqueue(object : Callback<DataEquitment>{
                override fun onResponse(
                    call: Call<DataEquitment>,
                    response: Response<DataEquitment>
                ) {
                    dataEquitment = response.body()
                    listdevice?.addAll(dataEquitment?.data?.data!!)
                    Log.d("checkkkk equiment", response.body()?.status.toString())
                }

                override fun onFailure(call: Call<DataEquitment>, t: Throwable) {
                    Log.d("checkkk equitment", "that bai")
                }

            })
        }
        fun getdataEquitment() : DataEquitment?{
            return dataEquitment
        }
        fun dataEquitmentbyId(id: String, token: String) {
            ApiServiceFactory.createApiService().getdatadevicebyid(id, "Bearer $token").enqueue(object : Callback<EquitmentId>{
                override fun onResponse(
                    call: Call<EquitmentId>,
                    response: Response<EquitmentId>
                ) {
                    deviceid = null
                    deviceid = response.body()?.data
                    Log.d("check data equitmentby id", deviceid?.title.toString())
                }

                override fun onFailure(call: Call<EquitmentId>, t: Throwable) {
                    Log.d("check data equitmentby id", "that bai")
                }

            })
        }
        fun getdataEquitmentbyId() : Device?{
            return deviceid
        }
}