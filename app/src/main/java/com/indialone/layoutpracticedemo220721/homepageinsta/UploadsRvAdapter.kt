package com.indialone.layoutpracticedemo220721.homepageinsta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.InstaUploadItemLayoutBinding

class UploadsRvAdapter(
    private val postList: ArrayList<Int>
) : RecyclerView.Adapter<UploadsRvAdapter.UploadsRvViewHolder>() {
    class UploadsRvViewHolder(itemView: InstaUploadItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val imagePost = itemView.image

        fun bind(image: Int) {
            Glide.with(itemView.context)
                .load(image)
                .centerCrop()
                .into(imagePost)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UploadsRvViewHolder {
        val view =
            InstaUploadItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UploadsRvViewHolder(view)
    }

    override fun onBindViewHolder(holder: UploadsRvViewHolder, position: Int) {
        holder.bind(postList[position])
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}