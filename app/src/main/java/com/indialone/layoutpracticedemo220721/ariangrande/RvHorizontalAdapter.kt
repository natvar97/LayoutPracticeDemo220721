package com.indialone.layoutpracticedemo220721.ariangrande

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvHorizontalItemLayoutBinding
import com.indialone.layoutpracticedemo220721.ariangrande.models.Album

class RvHorizontalAdapter(
    private val list: ArrayList<Album>
) : RecyclerView.Adapter<RvHorizontalAdapter.RvHorizontalViewHolder>() {
    class RvHorizontalViewHolder(itemView: RvHorizontalItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val image = itemView.ivImage
        val name = itemView.tvName

        fun bind(album: Album) {
            Glide.with(itemView.context)
                .load(album.image)
                .centerCrop()
                .into(image)
            name.text = album.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvHorizontalViewHolder {
        val view = RvHorizontalItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RvHorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvHorizontalViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}