package com.example.demorecyclerview

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_01.layoutManager = LinearLayoutManager(this)
        recyclerView_01.adapter = MainAdapter()

        getJson()
    }

    fun getJson(){

        val url ="https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1)"
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object : Callback{

            override fun onFailure(call: Call, e: IOException) {
               println("Fail")
            }

            override fun onResponse(call: Call?, response: Response) {
                val body = response?.body()?.string()

                val gson = GsonBuilder().create()
                val homeFeed = gson.fromJson(body, HomeFeed::class.java)
            }


        })

    }
}









