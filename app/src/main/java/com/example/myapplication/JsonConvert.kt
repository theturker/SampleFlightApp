package com.example.myapplication

import android.content.Context
import android.util.Log
import com.example.myapplication.Model.FlightDetailResponse
import com.google.gson.Gson
import io.reactivex.Single
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.IOException
import java.io.InputStreamReader

class JsonConvert(private val contextVm:Context) {

    fun getData() : FlightDetailResponse{
        var cityList = FlightDetailResponse()
        try {
            val jsonReader = BufferedReader(InputStreamReader(this.contextVm.resources.openRawResource(R.raw.flight_search)))
            val jsonBuilder = StringBuilder()
            var line: String? = null
            while (jsonReader.readLine().also { line = it } != null) {
                jsonBuilder.append(line).append("\n")
            }
            val gson = Gson()
            cityList = gson.fromJson(jsonBuilder.toString(), FlightDetailResponse::class.java)
        } catch (e: FileNotFoundException) {
            Log.e("jsonFile", "file not found")
        } catch (e: IOException) {
            Log.e("jsonFile", "ioerror")
        }
        return cityList
    }
}