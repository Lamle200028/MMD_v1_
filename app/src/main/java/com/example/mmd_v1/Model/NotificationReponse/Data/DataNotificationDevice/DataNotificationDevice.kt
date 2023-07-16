package com.example.tesst.model.NotificationReponse.Data.DataNotificationDevice

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class DataNotificationDevice {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("user_id")
    @Expose
    var userId: Int? = null

    @SerializedName("content")
    @Expose
    var content: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param id
     * @param userId
     * @param content
     */
    constructor(id: Int?, userId: Int?, content: String?) : super() {
        this.id = id
        this.userId = userId
        this.content = content
    }
}