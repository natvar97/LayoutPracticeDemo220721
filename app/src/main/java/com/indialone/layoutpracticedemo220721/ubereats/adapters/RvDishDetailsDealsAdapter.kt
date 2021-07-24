package com.indialone.layoutpracticedemo220721.ubereats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvDishDetailsDealsItemLayoutBinding
import com.indialone.layoutpracticedemo220721.ubereats.models.DishType

class RvDishDetailsDealsAdapter(
    private val dishes: ArrayList<DishType>
) : RecyclerView.Adapter<RvDishDetailsDealsAdapter.RvDishDetailsDealsViewHolder>() {
    class RvDishDetailsDealsViewHolder(itemView: RvDishDetailsDealsItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val tvDishTitle = itemView.dishTitle
        val ivDishImage = itemView.ivDishImage
        val tvDishPrice = itemView.dishPrice

        fun bind(dish: DishType) {
            tvDishTitle.text = dish.dish_name
            tvDishPrice.text = dish.dish_price
            Glide.with(itemView.context)
                .load(dish.dish_image)
                .centerCrop()
                .into(ivDishImage)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RvDishDetailsDealsViewHolder {
        val view = RvDishDetailsDealsItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RvDishDetailsDealsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvDishDetailsDealsViewHolder, position: Int) {
        holder.bind(dishes[position])
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}