package com.example.tesst.model.BREachDepartment

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class BREachDepartment {
    @SerializedName("departmentId")
    @Expose
    var departmentId: Int? = null

    @SerializedName("departmentTitle")
    @Expose
    var departmentTitle: String? = null

    @SerializedName("brokenEquipmentsCount")
    @Expose
    var brokenEquipmentsCount: Int? = null

    @SerializedName("repairingEquipmentsCount")
    @Expose
    var repairingEquipmentsCount: Int? = null

    constructor() {}

    constructor(
        departmentId: Int?,
        departmentTitle: String?,
        brokenEquipmentsCount: Int?,
        repairingEquipmentsCount: Int?
    ) : super() {
        this.departmentId = departmentId
        this.departmentTitle = departmentTitle
        this.brokenEquipmentsCount = brokenEquipmentsCount
        this.repairingEquipmentsCount = repairingEquipmentsCount
    }
}