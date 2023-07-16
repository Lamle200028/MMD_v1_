package com.example.tesst.model.NotificationReponse

import com.example.tesst.model.NotificationReponse.Data.Notification
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class DataNotification {
    @SerializedName("status")
    @Expose
    var status: Int? = null

    @SerializedName("data")
    @Expose
    var data: ArrayList<Notification>? = null

    @SerializedName("total")
    @Expose
    var total: Int? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param total
     * @param data
     * @param status
     */
    constructor(status: Int?, data: ArrayList<Notification>?, total: Int?) : super() {
        this.status = status
        this.data = data
        this.total = total
    }
}