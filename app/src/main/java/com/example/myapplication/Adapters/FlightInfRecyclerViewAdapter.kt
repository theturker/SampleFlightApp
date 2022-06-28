package com.example.myapplication.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Model.FlightDetailResponse
import com.example.myapplication.Model.FlightInfo
import com.example.myapplication.R


class FlightInfRecyclerViewAdapter(private val flightList: ArrayList<FlightInfo>) : RecyclerView.Adapter<FlightInfRecyclerViewAdapter.RowHolder>() {

    interface Listener {
        fun onItemClick(flightModel: FlightDetailResponse)
    }

    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {
        val logo: ImageView = view.findViewById(R.id.iv_airlines_logo)
        val airlinesname: TextView = view.findViewById(R.id.tv_airlines_name)
        val locationstr: TextView = view.findViewById(R.id.tv_location)
        val flighttime: TextView = view.findViewById(R.id.tv_flight_time)
        val flightprice: TextView = view.findViewById(R.id.tv_flight_money)
        val flytype: TextView = view.findViewById(R.id.tv_fly_type)
        val baggagetype: TextView = view.findViewById(R.id.tv_baggage_type)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_flight_info,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        val flight = flightList[position]
        Glide.with(holder.logo.context).load(flight.airlinesFlag).placeholder(R.drawable.thylogo).dontAnimate().into(holder.logo)
        holder.airlinesname.text = flight.code
        holder.locationstr.text = flight.saw + " > " + flight.ams
        holder.flighttime.text = flight.dateStr + " > " + flight.datetwostr
        holder.flightprice.text = flight.price + "TL"
        holder.flytype.text = "Direkt Uçuş"
        holder.baggagetype.text = flight.kg + "kg/kişi"
    }

    override fun getItemCount(): Int {
        return flightList.count()
    }


}