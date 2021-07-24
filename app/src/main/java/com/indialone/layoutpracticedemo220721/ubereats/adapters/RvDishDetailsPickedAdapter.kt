package com.indialone.layoutpracticedemo220721.ubereats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvDishDetailsItemLayoutBinding
import com.indialone.layoutpracticedemo220721.ubereats.models.DishType

class RvDishDetailsPickedAdapter(
    private val dishes: ArrayList<DishType>
) : RecyclerView.Adapter<RvDishDetailsPickedAdapter.RvDishDetailsPickedViewHolder>() {
    class RvDishDetailsPickedViewHolder(itemView: RvDishDetailsItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val ivDishImage = itemView.ivDishImage
        val tvDishTitle = itemView.tvDishTitle
        val tvDishAbout = itemView.tvDishAbout
        val tvDishPrice = itemView.tvDishPrice

        fun bind(dish: DishType) {
            Glide.with(itemView.context)
                .load(dish.dish_image)
                .centerCrop()
                .into(ivDishImage)
            tvDishTitle.text = dish.dish_name
            tvDishAbout.text = dish.dish_about
            tvDishPrice.text = dish.dish_price
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RvDishDetailsPickedViewHolder {
        val view = RvDishDetailsItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RvDishDetailsPickedViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvDishDetailsPickedViewHolder, position: Int) {
        holder.bind(dishes[position])
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}