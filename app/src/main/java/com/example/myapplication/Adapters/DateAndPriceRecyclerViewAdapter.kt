package com.example.myapplication.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Model.FlightDetailResponse
import com.example.myapplication.Model.ToolDateAndPrice
import com.example.myapplication.R


class DateAndPriceRecyclerViewAdapter(private val dateAndPriceList: ArrayList<ToolDateAndPrice>) : RecyclerView.Adapter<DateAndPriceRecyclerViewAdapter.ModelViewHolder>() {

    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dateVal: TextView = view.findViewById(R.id.tv_date_text)
        val priceVal: TextView = view.findViewById(R.id.tv_date_price)

        fun bindItems(item: FlightDetailResponse) {
            for (i in 0 until item.data?.flights?.departure!!.size){
                dateVal.text = item.data?.flights?.departure?.get(i)?.segments?.get(i)!!.displayDepartureDatetime
                priceVal.text = item.data?.flights?.departure?.get(i)?.averagePriceBreakdown?.total.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dail_and_price, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dateAndPriceList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        val animal = dateAndPriceList[position]
        holder.dateVal.text = animal.date
        holder.priceVal.text = animal.price
    }
}