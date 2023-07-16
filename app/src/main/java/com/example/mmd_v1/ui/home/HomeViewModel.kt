package com.example.mmd_v1.ui.home

import android.widget.LinearLayout
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _itemListdevice = MutableLiveData<Boolean>()

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }

    fun setonclick() {
        _itemListdevice.value = true
    }

    val text: LiveData<String> = _text

    val itemListdevice : LiveData<Boolean> = _itemListdevice
}