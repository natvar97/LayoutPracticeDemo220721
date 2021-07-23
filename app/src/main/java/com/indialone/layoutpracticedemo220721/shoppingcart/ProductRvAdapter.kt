package com.indialone.layoutpracticedemo220721.shoppingcart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.layoutpracticedemo220721.databinding.RvProductItemLayoutBinding

class ProductRvAdapter(
    private val productList: ArrayList<Product>
) : RecyclerView.Adapter<ProductRvAdapter.ProductRvViewHolder>() {
    class ProductRvViewHolder(itemView: RvProductItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        val ivProduct = itemView.ivProduct
        val tvProductName = itemView.tvProductName
        val tvStockStatus = itemView.tvStockStatus
        val btnQuantity = itemView.btnQuantity
        val tvPrice = itemView.tvProductPrice

        fun bind(product: Product) {
            Glide.with(itemView.context)
                .load(product.product_image)
                .centerCrop()
                .into(ivProduct)

            tvProductName.text = product.product_name
            tvStockStatus.text = product.product_availability
            btnQuantity.setText(product.product_quantity)
            tvPrice.text = product.product_price

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductRvViewHolder {
        val view =
            RvProductItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductRvViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductRvViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}