package com.example.tesst.model.baohong.data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class ResponseData {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    constructor() {}

    constructor(status: String?, message: String?) : super() {
        this.status = status
        this.message = message
    }
}