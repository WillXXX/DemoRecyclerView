package com.example.demorecyclerview

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val getListWeb: GetListWeb): RecyclerView.Adapter<MyAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.CustomViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: MyAdapter.CustomViewHolder, position: Int) {
    }



//
//OBS:
//
    inner class CustomViewHolder(view: View): RecyclerView.ViewHolder(view)
}

