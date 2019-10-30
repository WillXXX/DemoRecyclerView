package com.example.demorecyclerview

import androidx.recyclerview.widget.RecyclerView

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<>(){

    override fun getItemCount(): Int {
        return homeFeed.items.count()
    }

}