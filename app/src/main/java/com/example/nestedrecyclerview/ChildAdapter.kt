package com.example.nestedrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChildAdapter(private val childList : List<ChildItem>) : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    inner class ChildViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val logoIv : ImageView = itemView.findViewById(R.id.childLogoIv)
        val titleIv : TextView = itemView.findViewById(R.id.childTitleTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.child_item, parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.logoIv.setImageResource(childList[position].logo)
        holder.titleIv.text = childList[position].title

    }

    override fun getItemCount(): Int {
        return childList.size
    }
}