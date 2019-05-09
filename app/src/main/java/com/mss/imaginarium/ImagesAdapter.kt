package com.mss.imaginarium

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.image_list_item.view.*

class ImagesAdapter : RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {

    private val data = arrayListOf<String>()

    init {
        for (i in 1..100) {
            data.add("Apple")
            data.add("Cocos")
            data.add("Mango")
            data.add("Pineapple")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.image_list_item, null))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvImageCaption.text = data[position]
        holder.ivFruit.setImageResource(
            when (position % 4) {
                0 -> R.drawable.apple
                1 -> R.drawable.cocos
                2 -> R.drawable.mango
                3 -> R.drawable.pineapple
                else -> 0
            }
        )
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvImageCaption: TextView = view.tvImageCaption
        val ivFruit: ImageView = view.ivFruit
    }
}