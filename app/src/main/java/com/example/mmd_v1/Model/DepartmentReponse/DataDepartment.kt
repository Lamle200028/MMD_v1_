package com.example.tesst.model.DepartmentReponse

import com.example.tesst.model.DepartmentReponse.Data.Department
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class DataDepartment {
    @SerializedName("status_code")
    @Expose
    var statusCode: Int? = null

    @SerializedName("data")
    @Expose
    var data: ArrayList<Department>? = null

    @SerializedName("dataLength")
    @Expose
    var dataLength: Int? = null
    constructor() {}

    constructor(statusCode: Int?, data: ArrayList<Department>?, dataLength: Int?) : super() {
        this.statusCode = statusCode
        this.data = data
        this.dataLength = dataLength
    }
}