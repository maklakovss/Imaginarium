package com.mss.imaginarium

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.images_item.view.*

class ImagesAdapter(val dataList: List<ImageInfo>) : RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, itemType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.images_item, parent, false))

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageInfo = dataList[position]
        holder.itemView.ivPictire.setImageResource(imageInfo.imageResId)
        holder.itemView.tvCaption.text = imageInfo.caption
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}