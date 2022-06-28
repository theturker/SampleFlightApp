package com.example.myapplication.Model

import com.google.gson.annotations.SerializedName


data class SegmentAttributes (

  @SerializedName("free_meal" ) var freeMeal : Boolean? = null

)