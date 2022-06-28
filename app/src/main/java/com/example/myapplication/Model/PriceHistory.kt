package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class PriceHistory (

  @SerializedName("departure" ) var departure : Departure? = Departure()

)