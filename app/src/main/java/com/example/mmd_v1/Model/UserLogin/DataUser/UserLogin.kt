package com.example.tesst.model.UserLogin.DataUser

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class UserLogin {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("email_verified_at")
    @Expose
    var emailVerifiedAt: String? = null

    @SerializedName("current_team_id")
    @Expose
    var currentTeamId: Any? = null

    @SerializedName("displayname")
    @Expose
    var displayname: String? = null

    @SerializedName("image")
    @Expose
    var image: Any? = null

    @SerializedName("address")
    @Expose
    var address: Any? = null

    @SerializedName("birthday")
    @Expose
    var birthday: Any? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("department_id")
    @Expose
    var departmentId: Int? = null

    @SerializedName("gender")
    @Expose
    var gender: String? = null

    @SerializedName("is_disabled")
    @Expose
    var isDisabled: Int? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("profile_photo_url")
    @Expose
    var profilePhotoUrl: String? = null

    constructor() {}

    constructor(
        id: Int?,
        name: String?,
        email: String?,
        emailVerifiedAt: String?,
        currentTeamId: Any?,
        displayname: String?,
        image: Any?,
        address: Any?,
        birthday: Any?,
        phone: String?,
        departmentId: Int?,
        gender: String?,
        isDisabled: Int?,
        createdAt: String?,
        updatedAt: String?,
        profilePhotoUrl: String?
    ) : super() {
        this.id = id
        this.name = name
        this.email = email
        this.emailVerifiedAt = emailVerifiedAt
        this.currentTeamId = currentTeamId
        this.displayname = displayname
        this.image = image
        this.address = address
        this.birthday = birthday
        this.phone = phone
        this.departmentId = departmentId
        this.gender = gender
        this.isDisabled = isDisabled
        this.createdAt = createdAt
        this.updatedAt = updatedAt
        this.profilePhotoUrl = profilePhotoUrl
    }
}