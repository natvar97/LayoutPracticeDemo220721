package com.indialone.layoutpracticedemo220721.ariangrande

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvVerticalItemLayoutBinding
import com.indialone.layoutpracticedemo220721.ariangrande.models.Music

class RvVerticalAdapter(
    private val list: ArrayList<Music>
) : RecyclerView.Adapter<RvVerticalAdapter.RvVerticalViewHolder>() {
    class RvVerticalViewHolder(itemView: RvVerticalItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val id = itemView.count
        val image = itemView.image
        val name = itemView.name
        var about = itemView.about

        fun bind(music: Music) {
            id.text = music.id
            name.text = music.name
            about.text = music.about

            Glide.with(itemView.context)
                .load(music.image)
                .centerCrop()
                .into(image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvVerticalViewHolder {
        val view = RvVerticalItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvVerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvVerticalViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}