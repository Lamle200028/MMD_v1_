package com.example.tesst.model.Eqiutmentreponsev2.Data

import com.example.tesst.model.Eqiutmentreponsev2.Data.dataDevice.Device
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Equitment {
    @SerializedName("current_page")
    @Expose
    var currentPage: Int? = null

    @SerializedName("data")
    @Expose
    var data: ArrayList<Device>? = null

    @SerializedName("first_page_url")
    @Expose
    var firstPageUrl: String? = null

    @SerializedName("from")
    @Expose
    var from: Int? = null

    @SerializedName("next_page_url")
    @Expose
    var nextPageUrl: String? = null

    @SerializedName("path")
    @Expose
    var path: String? = null

    @SerializedName("per_page")
    @Expose
    var perPage: Int? = null

    @SerializedName("prev_page_url")
    @Expose
    var prevPageUrl: Any? = null

    @SerializedName("to")
    @Expose
    var to: Int? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}
    constructor(
        currentPage: Int?,
        data: ArrayList<Device>?,
        firstPageUrl: String?,
        from: Int?,
        nextPageUrl: String?,
        path: String?,
        perPage: Int?,
        prevPageUrl: Any?,
        to: Int?
    ) : super() {
        this.currentPage = currentPage
        this.data = data
        this.firstPageUrl = firstPageUrl
        this.from = from
        this.nextPageUrl = nextPageUrl
        this.path = path
        this.perPage = perPage
        this.prevPageUrl = prevPageUrl
        this.to = to
    }
}