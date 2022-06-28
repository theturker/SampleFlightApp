package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Origin (

  @SerializedName("label"        ) var label       : String?  = null,
  @SerializedName("id"           ) var id          : String?  = null,
  @SerializedName("is_city"      ) var isCity      : Boolean? = null,
  @SerializedName("city_name"    ) var cityName    : String?  = null,
  @SerializedName("slug"         ) var slug        : String?  = null,
  @SerializedName("airport_name" ) var airportName : String?  = null,
  @SerializedName("country_name" ) var countryName : String?  = null,
  @SerializedName("country_code" ) var countryCode : String?  = null

)