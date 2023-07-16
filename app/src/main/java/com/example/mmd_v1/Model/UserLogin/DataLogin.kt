package com.example.tesst.model.UserLogin

import com.example.tesst.model.UserLogin.DataUser.UserLogin
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class DataLogin {
    @SerializedName("data")
    @Expose
    var data: UserLogin? = null

    @SerializedName("status_code")
    @Expose
    var statusCode: Int? = null

    @SerializedName("access_token")
    @Expose
    var accessToken: String? = null

    @SerializedName("token_type")
    @Expose
    var tokenType: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param accessToken
     * @param tokenType
     * @param statusCode
     */
    constructor(data: UserLogin?, statusCode: Int?, accessToken: String?, tokenType: String?) : super() {
        this.data = data
        this.statusCode = statusCode
        this.accessToken = accessToken
        this.tokenType = tokenType
    }
}