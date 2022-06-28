package com.example.myapplication.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.reactivex.Single


class FlightDetailResponse {

  @SerializedName("data")
  @Expose
  var data: Data? = Data()
}