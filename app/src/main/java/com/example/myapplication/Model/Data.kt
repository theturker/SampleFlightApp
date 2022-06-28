package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Data (

    @SerializedName("search_parameters"   ) var searchParameters : SearchParameters?   = SearchParameters(),
    @SerializedName("created_at"          ) var createdAt        : String?             = null,
    @SerializedName("airlines"            ) var airlines         : ArrayList<Airlines> = arrayListOf(),
    @SerializedName("airports"            ) var airports         : ArrayList<Airports> = arrayListOf(),
    @SerializedName("stop_counts"         ) var stopCounts       : ArrayList<String>             = arrayListOf(),
    @SerializedName("baggages"            ) var baggages         : ArrayList<Int>      = arrayListOf(),
    @SerializedName("filter_boundaries"   ) var filterBoundaries : FilterBoundaries?   = FilterBoundaries(),
    @SerializedName("has_vi_flight"       ) var hasViFlight      : Boolean?            = null,
    @SerializedName("info_message"        ) var infoMessage      : String?             = null,
    @SerializedName("search_url"          ) var searchUrl        : String?             = null,
    @SerializedName("short_search_url"    ) var shortSearchUrl   : String?             = null,
    @SerializedName("currencies"          ) var currencies       : Currencies?         = Currencies(),
    @SerializedName("bus_search_data_tab" ) var busSearchDataTab : String?             = null,
    @SerializedName("flights"             ) var flights          : Flights?            = Flights(),
    @SerializedName("price_history"       ) var priceHistory     : PriceHistory?       = PriceHistory()

)