package com.example.tesst.model.UserReponse.UserReponse

import com.example.tesst.model.UserReponse.UserReponse.Data.User
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DataUser {
    @SerializedName("data")
    @Expose
    var data: ArrayList<User>? = null

    @SerializedName("dataLength")
    @Expose
    var dataLength: Int? = null

    constructor() {}

    constructor( data: ArrayList<User>?, dataLength: Int?) : super() {
        this.data = data
        this.dataLength = dataLength
    }


}