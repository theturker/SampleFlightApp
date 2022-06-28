package com.example.myapplication.Views

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapters.DateAndPriceRecyclerViewAdapter
import com.example.myapplication.Adapters.FlightInfRecyclerViewAdapter
import com.example.myapplication.JsonConvert
import com.example.myapplication.Model.FlightDetailResponse
import com.example.myapplication.Model.FlightInfo
import com.example.myapplication.Model.ToolDateAndPrice
import com.example.myapplication.R
import com.google.gson.Gson
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.IOException
import java.io.InputStreamReader


class MainActivity : AppCompatActivity(), FlightInfRecyclerViewAdapter.Listener {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flightInfo = JsonConvert(applicationContext).getData()

        airlinesDetail(flightInfo)
        dateAndPrice(flightInfo)



        val layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
        rv_date_price.layoutManager = layoutManager

        val layoutFlightManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        rv_flights_list.layoutManager = layoutFlightManager
    }

    override fun onItemClick(flightModel: FlightDetailResponse) {
        TODO("Not yet implemented")
    }

    @SuppressLint("CheckResult")
    fun dateAndPrice(flightInfo: FlightDetailResponse){

        val dateAndPrice = ArrayList<ToolDateAndPrice>()
        tv_flight_city.text = flightInfo.data?.searchParameters?.origin?.cityName + " → " + flightInfo.data?.searchParameters?.destination?.cityName
        val observable = PublishSubject.create<Int>()
        observable
            .toFlowable(BackpressureStrategy.DROP)
            .observeOn(Schedulers.computation())
            .subscribe (
                {
                    println("The Number Is: $it")
                },
                {t->
                    print(t.message)
                }
            )
        for (i in 0 until flightInfo.data?.flights?.departure!!.size){
            dateAndPrice.add(ToolDateAndPrice(flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.displayDepartureDatetime.toString(),
                flightInfo.data?.flights?.departure?.get(i)?.averagePriceBreakdown?.total.toString()))
        }


        rv_date_price.adapter = DateAndPriceRecyclerViewAdapter(dateAndPrice)
    }

    @SuppressLint("CheckResult")
    fun airlinesDetail(flightInfo : FlightDetailResponse){
        val flightInfos = ArrayList<FlightInfo>()
        var airlinesSize = flightInfo.data!!.airlines.size
        val observable = PublishSubject.create<Int>()
        observable
            .toFlowable(BackpressureStrategy.DROP)
            .observeOn(Schedulers.computation())
            .subscribe (
                {
                    println("The Number Is: $it")
                },
                {t->
                    print(t.message)
                }
            )
        for (i in 0 until flightInfo.data?.flights?.departure!!.size){
            var baggageControl: String = flightInfo.data?.flights?.departure?.get(i)?.infos?.baggageInfo?.firstBaggageCollection.toString()
            baggageControl = if (baggageControl == "[]")
                "0"
            else
                flightInfo.data?.flights?.departure?.get(i)?.infos?.baggageInfo?.firstBaggageCollection?.get(0)?.allowance.toString()

            var airlinesCode = ""
            var airlinesImage = ""
            var airlinesInfoSize = 0

            for (x in airlinesInfoSize..airlinesSize){
                if (flightInfo.data!!.airlines[airlinesInfoSize].code == flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.marketingAirline)
                {
                    airlinesCode = flightInfo.data!!.airlines[airlinesInfoSize].name.toString()
                    airlinesImage = flightInfo.data!!.airlines[airlinesInfoSize].image.toString()
                    break
                }
                airlinesInfoSize += 1
            }

            flightInfos.add(FlightInfo(
                airlinesCode,
                airlinesImage,
                flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.origin.toString(),
                flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.destination.toString(),
                flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.departureDatetime?.time.toString(),
                flightInfo.data?.flights?.departure?.get(i)?.segments?.get(0)!!.arrivalDatetime?.time.toString(),
                flightInfo.data?.flights?.departure?.get(i)?.priceBreakdown?.total.toString(),
                baggageControl))
        }

        rv_flights_list.adapter = FlightInfRecyclerViewAdapter(flightInfos)
    }
}