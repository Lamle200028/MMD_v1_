package com.example.tesst.model.Eqiutmentreponsev2

import com.example.tesst.model.Eqiutmentreponsev2.Data.Equitment
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class DataEquitment {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("data")
    @Expose
    var data: Equitment? = null

    @SerializedName("dataLength")
    @Expose
    var dataLength: Int? = null
    constructor(status: String?, data: Equitment?, dataLength: Int?) : super() {
        this.status = status
        this.data = data
        this.dataLength = dataLength
    }
}