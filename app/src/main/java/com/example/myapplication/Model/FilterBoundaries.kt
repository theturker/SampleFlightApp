package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class FilterBoundaries (

  @SerializedName("departurePrice"       ) var departurePrice       : DeparturePrice? = DeparturePrice(),
  @SerializedName("returnPrice"          ) var returnPrice          : ReturnPrice?    = ReturnPrice(),
  @SerializedName("departureMaxDuration" ) var departureMaxDuration : Int?            = null,
  @SerializedName("returnMaxDuration"    ) var returnMaxDuration    : Int?            = null

)