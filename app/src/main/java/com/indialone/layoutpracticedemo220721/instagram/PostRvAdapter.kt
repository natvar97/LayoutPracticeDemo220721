package com.indialone.layoutpracticedemo220721.instagram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.InstaFollowSuggestionItemLayoutBinding
import com.indialone.layoutpracticedemo220721.databinding.InstaPostLayoutBinding
import com.indialone.layoutpracticedemo220721.databinding.InstaSuggestedItemLayoutBinding

class PostRvAdapter(
    private val list: ArrayList<Any>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val POST = 1
    private val SUGGESTION = 2

    class PostLayoutViewHolder(itemView: InstaPostLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {

        val ivPostSmall = itemView.ivPostSmall
        val ivPostMain = itemView.ivPostMain
        val tvPostName = itemView.tvPostName
        val tvPostLocation = itemView.tvPostLocation
        val tvPostLikes = itemView.tvPostLikes
        val tvPostDate = itemView.tvPostDate

        fun bind(post: PostItem) {
            Glide.with(itemView.context)
                .load(post.post_small_image)
                .centerCrop()
                .into(ivPostSmall)

            Glide.with(itemView.context)
                .load(post.post_image)
                .fitCenter()
                .into(ivPostMain)

            tvPostName.text = post.post_title
            tvPostLocation.text = post.post_location
            tvPostLikes.text = post.post_likes
            tvPostDate.text = post.post_date
        }

    }

    class InstaFollowSuggestionViewHolder(itemView: InstaSuggestedItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {

        val rvFollowSuggestions = itemView.rvFollowSuggestions

        fun bind(item: SuggestedItem) {
            val layoutManager = LinearLayoutManager(itemView.context)
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            rvFollowSuggestions.layoutManager = layoutManager
            rvFollowSuggestions.adapter = SuggestionRvAdapter(item.users_list)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        lateinit var viewHolder: RecyclerView.ViewHolder

        when (viewType) {
            POST -> {
                val view = InstaPostLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = PostLayoutViewHolder(view)
            }
            SUGGESTION -> {
                val view = InstaSuggestedItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                viewHolder = InstaFollowSuggestionViewHolder(view)
            }
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PostLayoutViewHolder -> {
                holder.bind(list[position] as PostItem)
            }
            is InstaFollowSuggestionViewHolder -> {
                holder.bind(list[position] as SuggestedItem)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        if (list[position] is PostItem) {
            return POST
        }
        if (list[position] is SuggestedItem) {
            return SUGGESTION
        }
        return super.getItemViewType(position)
    }

}