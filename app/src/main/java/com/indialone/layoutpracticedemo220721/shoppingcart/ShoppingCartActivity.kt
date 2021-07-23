package com.indialone.layoutpracticedemo220721.shoppingcart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityShoppingCartBinding

class ShoppingCartActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityShoppingCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityShoppingCartBinding.inflate(layoutInflater)
        setContentView(mBinding.root)


        mBinding.rvShopping.layoutManager = LinearLayoutManager(this)
        mBinding.rvShopping.adapter = ProductRvAdapter(getShoppingItemsList())

    }

    fun getShoppingItemsList(): ArrayList<Product> {
        return arrayListOf(
            Product("Product Name 1", R.drawable.product1, "1", "$ 12", "In Stock"),
            Product("Product Name 2", R.drawable.product2, "4", "$ 10", "Out of Stock"),
            Product("Product Name 3", R.drawable.product3, "2", "$ 180", "In Stock"),
            Product("Product Name 4", R.drawable.product4, "7", "$ 120", "Out of Stock"),
        )
    }

}