package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.myapplication.Model.CityDetail

class CityList {
    @SerializedName("cityDetail")
    @Expose
    val cityDetail: List<CityDetail>? = null
}