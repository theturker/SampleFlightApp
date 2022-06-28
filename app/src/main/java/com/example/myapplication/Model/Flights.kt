package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class Flights (

  @SerializedName("departure" ) var departure : ArrayList<Deparatures> = arrayListOf()

)