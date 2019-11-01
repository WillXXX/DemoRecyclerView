package com.example.demorecyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): {
        val layoutInflater = layoutInflater.from()

    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return homeFeed.items.count()
    }

}