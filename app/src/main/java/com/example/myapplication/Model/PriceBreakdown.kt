package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class PriceBreakdown (

  @SerializedName("base"               ) var base              : Float?    = null,
  @SerializedName("tax"                ) var tax               : Float?    = null,
  @SerializedName("service"            ) var service           : Double? = null,
  @SerializedName("reissue_service"    ) var reissueService    : Int?    = null,
  @SerializedName("total"              ) var total             : Double? = null,
  @SerializedName("currency"           ) var currency          : String? = null,
  @SerializedName("discount"           ) var discount          : Int?    = null,
  @SerializedName("displayed_currency" ) var displayedCurrency : String? = null,
  @SerializedName("internal_assurance" ) var internalAssurance : Int?    = null,
  @SerializedName("extra_fee"          ) var extraFee          : Float?    = null,
  @SerializedName("penalty"            ) var penalty           : Int?    = null

)