package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Duration (

  @SerializedName("day"           ) var day          : Int? = null,
  @SerializedName("hour"          ) var hour         : Int? = null,
  @SerializedName("minute"        ) var minute       : Int? = null,
  @SerializedName("total_minutes" ) var totalMinutes : Int? = null

)