package com.indialone.layoutpracticedemo220721.instagram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.InstaFollowSuggestionItemLayoutBinding
import com.indialone.layoutpracticedemo220721.databinding.InstaSuggestedItemLayoutBinding

class SuggestionRvAdapter(
    private val suggestionList: ArrayList<StatusItem>
) : RecyclerView.Adapter<SuggestionRvAdapter.SuggestionRvViewHolder>() {
    class SuggestionRvViewHolder(itemView: InstaFollowSuggestionItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val ivSuggestionImage = itemView.ivSuggestionImage
        val tvSuggestionName = itemView.tvSuggestionName

        fun bind(status: StatusItem) {
            Glide.with(itemView.context)
                .load(status.status_image)
                .centerCrop()
                .into(ivSuggestionImage)

            tvSuggestionName.text = status.status_name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestionRvViewHolder {
        val view = InstaFollowSuggestionItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SuggestionRvViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuggestionRvViewHolder, position: Int) {
        holder.bind(suggestionList[position])
    }

    override fun getItemCount(): Int {
        return suggestionList.size
    }

}
