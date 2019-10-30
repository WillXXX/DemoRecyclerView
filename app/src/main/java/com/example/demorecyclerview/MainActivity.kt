package com.example.demorecyclerview

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

            override fun onResponse(call: Call, response: Response) {
                //Lib Gson do Google
                val body = response.body()?.string()
                val gsom = GsonBuilder().create()
                val homeFeed = gsom.fromJson(body, HomeFeed::class.java)
            }


        })

    }
}
