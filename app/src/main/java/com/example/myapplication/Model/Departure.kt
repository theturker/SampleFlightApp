package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Departure (

  @SerializedName("previous_day_price" ) var previousDayPrice : Int? = null,
  @SerializedName("next_day_price"     ) var nextDayPrice     : Int? = null

)