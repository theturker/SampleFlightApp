package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Airports (

  @SerializedName("id"           ) var id          : String? = null,
  @SerializedName("slug"         ) var slug        : String? = null,
  @SerializedName("airport_name" ) var airportName : String? = null,
  @SerializedName("city_code"    ) var cityCode    : String? = null,
  @SerializedName("city_name"    ) var cityName    : String? = null,
  @SerializedName("city_slug"    ) var citySlug    : String? = null,
  @SerializedName("country_code" ) var countryCode : String? = null,
  @SerializedName("country_name" ) var countryName : String? = null

)