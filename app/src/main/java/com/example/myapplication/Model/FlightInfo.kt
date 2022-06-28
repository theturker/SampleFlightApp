package com.example.myapplication.Model

import com.example.myapplication.ListItem
import com.example.myapplication.R

data class FlightInfo (val code: String, val airlinesFlag: String, val saw: String, val ams: String, val dateStr: String, val datetwostr: String,
                             val price: String, val kg: String) : ListItem(R.layout.item_flight_info)
