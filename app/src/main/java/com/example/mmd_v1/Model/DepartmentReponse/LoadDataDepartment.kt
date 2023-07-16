package com.example.tesst.model.DepartmentReponse

import android.util.Log
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoadDataDepartment {
    companion object{
        var dataDepartment1 : DataDepartment? = null
        fun setDataDepartment(token : String){
            ApiServiceFactory.createApiService().getdataDepartment("Bearer $token").enqueue(object : Callback<DataDepartment>{
                override fun onResponse(
                    call: Call<DataDepartment>,
                    response: Response<DataDepartment>
                ) {
                    dataDepartment1 = response.body()
                    Log.d("checkk data department", response.body()?.dataLength.toString())
                }

                override fun onFailure(call: Call<DataDepartment>, t: Throwable) {
                    Log.d("check department", "thatbai")
                }

            })
        }
        fun getDataDepartment() : DataDepartment? {
            return dataDepartment1
        }
    }
}