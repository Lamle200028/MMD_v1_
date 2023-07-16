package com.example.tesst.model.Eqiutmentreponsev2.Data

import com.example.tesst.model.Eqiutmentreponsev2.Data.dataDevice.Device
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EquitmentId {
    @SerializedName("data")
    @Expose
    var data: Device? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}
    constructor(
        data: Device?,

    ) : super() {
        this.data = data
    }
}