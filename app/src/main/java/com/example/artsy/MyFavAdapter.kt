package com.example.artsy

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyFavAdapter(private val dataSet: ArrayList<String>) :
    RecyclerView.Adapter<MyFavAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val artist_name: TextView
        val artist_lang: TextView
        val artist_date: TextView
        init {
            artist_name = view.findViewById(R.id.fav_artist_name)
            artist_lang = view.findViewById(R.id.fav_artist_lang)
            artist_date = view.findViewById(R.id.fav_artist_year)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_fav_list, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.artist_name.text = dataSet[position]
        holder.artist_lang.text = dataSet[position]
        holder.artist_date.text = dataSet[position]

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun favData(data:ArrayList<String>) {

        //adding data to arrayList
       this.dataSet.clear()
        this.dataSet.addAll(data)
        notifyDataSetChanged()
    }


}