package com.indialone.layoutpracticedemo220721.ubereats.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvFoodCategoryItemBinding
import com.indialone.layoutpracticedemo220721.ubereats.models.FoodCategory
import java.util.*
import kotlin.collections.ArrayList

class RvFoodCategoryAdapter(
    private var foodCats: ArrayList<FoodCategory>
) : RecyclerView.Adapter<RvFoodCategoryAdapter.RvFoodCategoryViewHolder>() {
    class RvFoodCategoryViewHolder(itemView: RvFoodCategoryItemBinding) :
        RecyclerView.ViewHolder(itemView.root) {

        private val tvCategory = itemView.tvCategory
        private val ivCategory = itemView.ivCategory

        fun bind(category: FoodCategory) {
            tvCategory.text = category.name
            Glide.with(itemView.context)
                .load(category.image)
                .fitCenter()
                .into(ivCategory)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvFoodCategoryViewHolder {
        val view =
            RvFoodCategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RvFoodCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RvFoodCategoryViewHolder, position: Int) {
        holder.bind(foodCats[position])
    }

    override fun getItemCount(): Int {
        return foodCats.size
    }
}