package com.example.mmd_v1.ui.ListEquitment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.example.tesst.Api.ApiServiceFactory
import com.example.tesst.model.Eqiutmentreponsev2.DataEquitment
import com.example.tesst.model.Eqiutmentreponsev2.LoadDataEquitment
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListEquitmentViewModel : ViewModel() {
    private var rcy = MutableLiveData<RecyclerView>()
    private var _equitment = MutableLiveData<DataEquitment>()
    private var _backstact = MutableLiveData<Boolean>()
    private var _clickitem = MutableLiveData<Boolean>()
    private var _setsearch = MutableLiveData<String>()
    var equitment : LiveData<DataEquitment> = _equitment
    var backstact : LiveData<Boolean> = _backstact
    var clickitem : LiveData<Boolean> = _clickitem
    var setchangtext : LiveData<String> = _setsearch

    fun getdata(){
        LoadDataEquitment.setdataEquitment("Bearer dg44jqQDPZpTY5MlrLAQxhwGW6YAcDAyOfik12Yb")
        viewModelScope.launch {
            ApiServiceFactory.createApiService().getdatadevice("Bearer dg44jqQDPZpTY5MlrLAQxhwGW6YAcDAyOfik12Yb").enqueue(object :
                Callback<DataEquitment> {
                override fun onResponse(
                    call: Call<DataEquitment>,
                    response: Response<DataEquitment>
                ) {
                    _equitment.postValue(response.body())
                    Log.d("checkkkk equiment", response.body()?.status.toString())
                }

                override fun onFailure(call: Call<DataEquitment>, t: Throwable) {
                    Log.d("checkkk equitment", "that bai")
                }

            })
        }
    }

    fun setclickback(){
        _backstact.value = true
    }
    fun setclickitem(){
        _clickitem.value =true
    }
    fun searchtext(){

    }

}