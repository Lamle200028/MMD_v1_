package com.example.tesst.model.reportInventory

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReportInventory {
    @SerializedName("idEquitment")
    @Expose
    var idEquitment: String? = null

    @SerializedName("reason")
    @Expose
    var reason: String? = null

    constructor(idEquitment: String?, reason: String?) {
        this.idEquitment = idEquitment
        this.reason = reason
    }
}