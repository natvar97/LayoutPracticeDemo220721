package com.indialone.layoutpracticedemo220721.ubereats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.UberDishItemLayoutBinding
import com.indialone.layoutpracticedemo220721.ubereats.models.DishItem

class RvTodayOfferAdapter(
    private val dishes: ArrayList<DishItem>
) : RecyclerView.Adapter<RvTodayOfferAdapter.RvTodayOfferViewHolder>() {
    class RvTodayOfferViewHolder(itemView: UberDishItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val ivDish = itemView.ivDish
        private val tvDishName = itemView.tvDishName
        private val tvDishPrice = itemView.tvDishPrice
        private val tvDishRating = itemView.tvRating
        private val ivLike = itemView.ivDishLike
        private val tvOffer = itemView.tvDishOffer

        fun bind(dish: DishItem) {
            Glide.with(itemView.context)
                .load(dish.dish_image)
                .centerCrop()
                .into(ivDish)

            tvDishName.text = dish.dish_name
            tvDishPrice.text = dish.dish_price
            tvDishRating.text = dish.dish_rating

            if (dish.dish_is_liked) {
                ivLike.setImageDrawable(
                    ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.icon_heart_red
                    )
                )
            } else {
                ivLike.setImageDrawable(
                    ContextCompat.getDrawable(
                        itemView.context,
                        R.drawable.icon_heart_white
                    )
                )
            }

            if (dish.dish_on_offer) {
                tvOffer.visibility = View.VISIBLE
            } else {
                tvOffer.visibility = View.GONE
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvTodayOfferViewHolder {
        val view =
            UberDishItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvTodayOfferViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvTodayOfferViewHolder, position: Int) {
        holder.bind(dish = dishes[position])
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}