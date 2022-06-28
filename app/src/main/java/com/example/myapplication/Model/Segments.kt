package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Segments (

    @SerializedName("departure_datetime"         ) var departureDatetime        : DepartureDatetime? = DepartureDatetime(),
    @SerializedName("display_departure_datetime" ) var displayDepartureDatetime : String?            = null,
    @SerializedName("arrival_datetime"           ) var arrivalDatetime          : ArrivalDatetime?   = ArrivalDatetime(),
    @SerializedName("display_arrival_datetime"   ) var displayArrivalDatetime   : String?            = null,
    @SerializedName("class"                      ) var classType                : String?            = null,
    @SerializedName("flight_number"              ) var flightNumber             : String?            = null,
    @SerializedName("origin"                     ) var origin                   : String?            = null,
    @SerializedName("destination"                ) var destination              : String?            = null,
    @SerializedName("marketing_airline"          ) var marketingAirline         : String?            = null,
    @SerializedName("operating_airline"          ) var operatingAirline         : String?            = null,
    @SerializedName("available_seats"            ) var availableSeats           : Int?               = null,
    @SerializedName("origin_terminal"            ) var originTerminal           : String?            = null,
    @SerializedName("destination_terminal"       ) var destinationTerminal      : String?            = null,
    @SerializedName("segment_delay"              ) var segmentDelay             : Duration?           =null,
    @SerializedName("duration"                   ) var duration                 : Duration?          = Duration(),
    @SerializedName("is_train"                   ) var isTrain                  : Boolean?           = null,
    @SerializedName("segment_attributes"         ) var segmentAttributes        : SegmentAttributes? = SegmentAttributes(),
    @SerializedName("is_virtual_interlining"     ) var isVirtualInterlining     : Boolean?           = null

)