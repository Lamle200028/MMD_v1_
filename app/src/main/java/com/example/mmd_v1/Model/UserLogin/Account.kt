package com.example.tesst.model.UserLogin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Account {
    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null

    constructor(email: String?, password: String?) {
        this.email = email
        this.password = password
    }

}