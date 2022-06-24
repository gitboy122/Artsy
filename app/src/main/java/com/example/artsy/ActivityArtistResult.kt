package com.example.artsy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_artist_result.*

class ActivityArtistResult:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_result)

        setAdapter()
    }

    private fun setAdapter(){
        /*getData from Api and make model according to json response using json parser
        and then pass that class name in arrayList instead any. also pass that model to Adapter*/

      val data=ArrayList<Any>()
        val adapter=ArtistResultAdapter(data)
        rv_artist_result_list.adapter=adapter
    }
}