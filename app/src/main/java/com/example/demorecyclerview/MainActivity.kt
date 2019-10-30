package com.example.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getJson()
    }

    fun getJson(){

        val url ="https://api.github.com/search/repositories?q=language:Java&sort=stars&page=1)"

    }
}
