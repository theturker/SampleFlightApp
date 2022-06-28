package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class SearchParameters (

    @SerializedName("request_id"                 ) var requestId                : String?                 = null,
    @SerializedName("provider"                   ) var provider                 : String?                 = null,
    @SerializedName("origin"                     ) var origin                   : Origin?                 = Origin(),
    @SerializedName("destination"                ) var destination              : Destination?            = Destination(),
    @SerializedName("origins"                    ) var origins                  : ArrayList<Origins>      = arrayListOf(),
    @SerializedName("destinations"               ) var destinations             : ArrayList<Destinations> = arrayListOf(),
    @SerializedName("departure_dates"            ) var departureDates           : ArrayList<String>       = arrayListOf(),
    @SerializedName("departure_date"             ) var departureDate            : String?                 = null,
    @SerializedName("display_departure_date"     ) var displayDepartureDate     : String?                 = null,
    @SerializedName("display_departure_dates"    ) var displayDepartureDates    : ArrayList<String>       = arrayListOf(),
    @SerializedName("return_date"                ) var returnDate               : String?                 = null,
    @SerializedName("display_return_date"        ) var displayReturnDate        : String?                 = null,
    @SerializedName("adult"                      ) var adult                    : Int?                    = null,
    @SerializedName("senior"                     ) var senior                   : Int?                    = null,
    @SerializedName("student"                    ) var student                  : Int?                    = null,
    @SerializedName("child"                      ) var child                    : Int?                    = null,
    @SerializedName("infant"                     ) var infant                   : Int?                    = null,
    @SerializedName("passenger_count"            ) var passengerCount           : Int?                    = null,
    @SerializedName("passenger_servisable_count" ) var passengerServisableCount : Int?                    = null,
    @SerializedName("version"                    ) var version                  : Int?                    = null,
    @SerializedName("is_one_way"                 ) var isOneWay                 : Boolean?                = null,
    @SerializedName("is_domestic"                ) var isDomestic               : Boolean?                = null,
    @SerializedName("is_direct"                  ) var isDirect                 : Boolean?                = null,
    @SerializedName("is_refundable"              ) var isRefundable             : Boolean?                = null,
    @SerializedName("flight_class"               ) var flightClass              : String?                 = null

)