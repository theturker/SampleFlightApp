package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class FirstBaggageCollection (

  @SerializedName("paxType"   ) var paxType   : String?  = null,
  @SerializedName("allowance" ) var allowance : Int?     = null,
  @SerializedName("part"      ) var part      : Int?     = null,
  @SerializedName("unit"      ) var unit      : String?  = null,
  @SerializedName("type"      ) var type      : String?  = null,
  @SerializedName("small"     ) var small     : Boolean? = null

)