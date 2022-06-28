package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class CarryOn (

  @SerializedName("allowance" ) var allowance : Int?     = null,
  @SerializedName("type"      ) var type      : String?  = null,
  @SerializedName("unit"      ) var unit      : String?  = null,
  @SerializedName("part"      ) var part      : Int?     = null,
  @SerializedName("is_small"  ) var isSmall   : Boolean? = null

)