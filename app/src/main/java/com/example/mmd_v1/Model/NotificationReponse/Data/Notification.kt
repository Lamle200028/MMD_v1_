package com.example.tesst.model.NotificationReponse.Data

import com.example.tesst.model.NotificationReponse.Data.DataNotificationDevice.DataNotificationDevice
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Notification {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("notifiable_id")
    @Expose
    var notifiableId: Int? = null

    @SerializedName("notifiable_type")
    @Expose
    var notifiableType: String? = null

    @SerializedName("data")
    @Expose
    var data: DataNotificationDevice? = null

    @SerializedName("read_at")
    @Expose
    var readAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param createdAt
     * @param data
     * @param notifiableId
     * @param notifiableType
     * @param id
     * @param type
     * @param readAt
     * @param updatedAt
     */
    constructor(
        id: String?,
        type: String?,
        notifiableId: Int?,
        notifiableType: String?,
        data: DataNotificationDevice?,
        readAt: Any?,
        createdAt: String?,
        updatedAt: String?
    ) : super() {
        this.id = id
        this.type = type
        this.notifiableId = notifiableId
        this.notifiableType = notifiableType
        this.data = data
        this.readAt = readAt
        this.createdAt = createdAt
        this.updatedAt = updatedAt
    }
}