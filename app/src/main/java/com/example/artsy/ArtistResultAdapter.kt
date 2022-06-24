package com.example.artsy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ArtistResultAdapter(private val dataResult:ArrayList<Any>):RecyclerView.Adapter<ArtistResultAdapter.ArtisListViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtisListViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_artis_result, parent, false)

        return ArtisListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtisListViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
   //   return  dataResult.size

        return 4
    }

    class ArtisListViewHolder(view: View):RecyclerView.ViewHolder(view){

    }
}



