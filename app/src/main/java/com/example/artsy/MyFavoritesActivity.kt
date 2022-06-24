package com.example.artsy

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*

class MyFavoritesActivity():AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        onClickEvents()

        setAdapter()


    }

    private fun onClickEvents() {


       // to hide label of toolbar on click of searchIcon
        searchView.setOnQueryTextFocusChangeListener(object :View.OnFocusChangeListener{
            override fun onFocusChange(p0: View?, p1: Boolean) {
                txt_artist_search.visibility = View.GONE
            }

        })

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
//                val intent = Intent(it, StartActivity::class.java)

                val intent=Intent(this@MyFavoritesActivity,ActivityArtistResult::class.java)
                startActivity(intent)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return false
            }
        })

    }

    private fun setAdapter(){

        //create arraylist of required type and pass it to adapter method

        val data = ArrayList<String>()
        data.add("Hello madam")
        data.add("Hello madamJi")
        data.add("Hello 22g")
        data.add("Hello bro")

        val adapter = MyFavAdapter(data)
        rv_fav_list.adapter= adapter
//        adapter.favData(data)




//        var t1= findViewById<TextView>(R.id.bottom_text)
//        t1.setOnClickListener {
//
//            data.add("count "+count.toString())
//            adapter.notifyDataSetChanged()
//            count++
//
//        }
    }
}