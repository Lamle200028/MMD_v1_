package com.example.tesst.model.Eqiutmenttreponsev1

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Equitment {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("data")
    @Expose
    var data: ArrayList<Device>? = null

    @SerializedName("dataLength")
    @Expose
    var dataLength: Int? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param data
     * @param dataLength
     * @param status
     */
    constructor(status: String?, data: ArrayList<Device>?, dataLength: Int?) : super() {
        this.status = status
        this.data = data
        this.dataLength = dataLength
    }
}