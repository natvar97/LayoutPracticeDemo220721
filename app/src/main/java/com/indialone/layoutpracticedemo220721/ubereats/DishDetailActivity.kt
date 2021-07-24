package com.indialone.layoutpracticedemo220721.ubereats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityDishDetailBinding
import com.indialone.layoutpracticedemo220721.ubereats.adapters.RvDishDetailsDealsAdapter
import com.indialone.layoutpracticedemo220721.ubereats.adapters.RvDishDetailsPickedAdapter
import com.indialone.layoutpracticedemo220721.ubereats.models.DishType

class DishDetailActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityDishDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityDishDetailBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // rv picked
        mBinding.rvPicked.layoutManager = LinearLayoutManager(this)
        mBinding.rvPicked.adapter = RvDishDetailsPickedAdapter(getPickedList())

        // rv deals
        mBinding.rvDeals.layoutManager = LinearLayoutManager(this)
        mBinding.rvDeals.adapter = RvDishDetailsDealsAdapter(getDealsList())

    }

    private fun getPickedList(): ArrayList<DishType> {
        return arrayListOf(
            DishType(
                dish_name = "Pizza One",
                dish_image = R.drawable.pizza1,
                dish_about = "This is my favourite pizza",
                "$ 19.99"
            ),
            DishType(
                dish_name = "Pizza Two",
                dish_image = R.drawable.pizza2,
                dish_about = "This is my favourite pizza",
                "$ 29.99"
            ),
            DishType(
                dish_name = "Pizza Three",
                dish_image = R.drawable.pizza3,
                dish_about = "This is my favourite pizza",
                "$ 39.99"
            ),
        )
    }

    private fun getDealsList(): ArrayList<DishType> {
        return arrayListOf(
            DishType(
                dish_name = "Pizza Four",
                dish_image = R.drawable.pizza4,
                dish_about = "This is my favourite pizza",
                "$ 19.99"
            ),
            DishType(
                dish_name = "Pizza Five",
                dish_image = R.drawable.pizza5,
                dish_about = "This is my favourite pizza",
                "$ 29.99"
            ),
            DishType(
                dish_name = "Pizza Six",
                dish_image = R.drawable.pizza6,
                dish_about = "This is my favourite pizza",
                "$ 39.99"
            ),
        )
    }

}