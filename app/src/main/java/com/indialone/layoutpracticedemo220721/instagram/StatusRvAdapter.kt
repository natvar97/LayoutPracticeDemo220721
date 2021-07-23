package com.indialone.layoutpracticedemo220721.instagram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.InstaStatusItemLayoutBinding

class StatusRvAdapter(
    private val statusList: ArrayList<StatusItem>
) : RecyclerView.Adapter<StatusRvAdapter.StatusRvViewHolder>() {
    class StatusRvViewHolder(itemView: InstaStatusItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val ivStatusImage = itemView.ivStatusImage
        val tvStatusName = itemView.tvStatusName
        val ivStatusAdd = itemView.ivAddStatus

        fun bind(statusItem: StatusItem) {
            Glide.with(itemView.context)
                .load(statusItem.status_image)
                .centerCrop()
                .into(ivStatusImage)

            tvStatusName.text = statusItem.status_name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusRvViewHolder {
        val view =
            InstaStatusItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StatusRvViewHolder(view)
    }

    override fun onBindViewHolder(holder: StatusRvViewHolder, position: Int) {
        if (position == 0) holder.ivStatusAdd.visibility = View.VISIBLE
        else holder.ivStatusAdd.visibility = View.GONE
        holder.bind(statusList[position])
    }

    override fun getItemCount(): Int {
        return statusList.size
    }
}