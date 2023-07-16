package com.example.mmd_v1.ui.dashboard

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.example.tesst.Api.ApiServiceFactory
import com.example.tesst.model.Eqiutmentreponsev2.DataEquitment
import com.example.tesst.model.Eqiutmentreponsev2.LoadDataEquitment
import com.example.tesst.model.Eqiutmenttreponsev1.Equitment
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    private val _rcy = MutableLiveData<RecyclerView>()
    private var _equitment = MutableLiveData<DataEquitment>()
    var equitment : LiveData<DataEquitment> = _equitment
    var rcy : LiveData<RecyclerView> = _rcy
    init {
        _text.value = "lam dz"
    }
    fun getdata(){
        LoadDataEquitment.setdataEquitment("Bearer dg44jqQDPZpTY5MlrLAQxhwGW6YAcDAyOfik12Yb")
        viewModelScope.launch {
            ApiServiceFactory.createApiService().getdatadevice("Bearer dg44jqQDPZpTY5MlrLAQxhwGW6YAcDAyOfik12Yb").enqueue(object : Callback<DataEquitment>{
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

    val text: LiveData<String> = _text



    override fun onCleared() {
        super.onCleared()
    }
}