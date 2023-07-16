package com.example.tesst.model.UserLogin.LoadDataAccount

import android.util.Log
import android.util.Patterns
import com.example.tesst.Api.APIservice
import com.example.tesst.Api.ApiServiceFactory

import com.example.tesst.model.UserLogin.DataLogin
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoadDataAccount {
companion object{
    var userlogin : DataLogin? = null
    fun  setdataAccount(name : String, pass : String){
        ApiServiceFactory.createApiService().getdataUser(name,pass)?.enqueue(object : Callback<DataLogin>{
            override fun onResponse(call: Call<DataLogin>, response: Response<DataLogin>) {
                if (response.body()?.statusCode == 200) {
                    userlogin = response.body()
                    Log.d("checkkkk login", userlogin?.accessToken.toString())
                }
                else {
                    Log.d("checkkkk login", "that bai")
                    userlogin?.statusCode = 400
                    Log.d("checkkkk login that bai", userlogin?.statusCode.toString())
                }

            }
            override fun onFailure(call: Call<DataLogin>, t: Throwable) {
                Log.d("check", "that bai")
            }

        })
    }
//    fun getdataAccount() : DataLogin{
//        return userlogin!!
//    }
    fun checkemail(edittextemail : String) : Boolean {
        return !edittextemail.isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(edittextemail).matches()
    }
    fun checknullpass(pass :String) : Boolean{
        return !pass.isNullOrEmpty()
    }
}
}