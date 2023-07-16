package com.example.tesst.model.reportInventory

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class ResultSendInventory {
    @SerializedName("status_code")
    @Expose
    var statusCode: Int? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    constructor(statusCode: Int?, message: String?) : super() {
        this.statusCode = statusCode
        this.message = message
    }
}