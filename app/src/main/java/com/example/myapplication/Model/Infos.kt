package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Infos (

    @SerializedName("is_reservable"          ) var isReservable         : Boolean?     = null,
    @SerializedName("is_promo"               ) var isPromo              : Boolean?     = null,
    @SerializedName("duration"               ) var duration             : Duration?    = Duration(),
    @SerializedName("baggage_info"           ) var baggageInfo          : BaggageInfo? = BaggageInfo(),
    @SerializedName("is_virtual_interlining" ) var isVirtualInterlining : Boolean?     = null,
    @SerializedName("is_business"            ) var isBusiness           : Boolean?     = null,
    @SerializedName("active_warning"         ) var activeWarning        : String?      = null,
    @SerializedName("is_mask_required"       ) var isMaskRequired       : Boolean?     = null

)