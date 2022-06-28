package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class ArrivalDatetime (

  @SerializedName("date"      ) var date      : String? = null,
  @SerializedName("time"      ) var time      : String? = null,
  @SerializedName("timestamp" ) var timestamp : Int?    = null

)