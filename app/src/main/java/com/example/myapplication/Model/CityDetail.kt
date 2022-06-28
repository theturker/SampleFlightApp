package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class CityDetail {
    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("latitude")
    @Expose
    private val latitude: String? = null

    @SerializedName("longitude")
    @Expose
    private val longitude: String? = null

    @SerializedName("population")
    @Expose
    private val population: String? = null

    @SerializedName("region")
    @Expose
    private val region: String? = null
}