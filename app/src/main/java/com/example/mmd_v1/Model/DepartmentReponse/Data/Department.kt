package com.example.tesst.model.DepartmentReponse.Data

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Department {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("slug")
    @Expose
    var slug: String? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("address")
    @Expose
    var address: String? = null

    @SerializedName("user_id")
    @Expose
    var userId: Int? = null

    @SerializedName("author_id")
    @Expose
    var authorId: Any? = null

    @SerializedName("nursing_id")
    @Expose
    var nursingId: Int? = null

    @SerializedName("image")
    @Expose
    var image: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("browser")
    @Expose
    var browser: String? = null

    @SerializedName("browser_day")
    @Expose
    var browserDay: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}
    constructor(
        id: Int?,
        title: String?,
        code: String?,
        slug: String?,
        phone: String?,
        contact: String?,
        email: String?,
        address: String?,
        userId: Int?,
        authorId: Any?,
        nursingId: Int?,
        image: Any?,
        createdAt: String?,
        updatedAt: String?,
        browser: String?,
        browserDay: String?
    ) : super() {
        this.id = id
        this.title = title
        this.code = code
        this.slug = slug
        this.phone = phone
        this.contact = contact
        this.email = email
        this.address = address
        this.userId = userId
        this.authorId = authorId
        this.nursingId = nursingId
        this.image = image
        this.createdAt = createdAt
        this.updatedAt = updatedAt
        this.browser = browser
        this.browserDay = browserDay
    }
}