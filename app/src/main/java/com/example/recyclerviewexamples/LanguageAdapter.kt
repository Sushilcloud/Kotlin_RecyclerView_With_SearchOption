package com.example.recyclerviewexamples

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LanguageAdapter(var mList: List<LanguageData>):RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    inner class LanguageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val logo: ImageView =itemView.findViewById(R.id.logoTv)
        val title: TextView =itemView.findViewById(R.id.titleTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {

        holder.logo.setImageResource(mList[position].logo)
        holder.title.text=mList[position].title

    }
}