package com.indialone.layoutpracticedemo220721.ubereats

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityUberEatsMainBinding
import com.indialone.layoutpracticedemo220721.ubereats.adapters.RvAllDishesAdapter
import com.indialone.layoutpracticedemo220721.ubereats.adapters.RvFoodCategoryAdapter
import com.indialone.layoutpracticedemo220721.ubereats.adapters.RvTodayOfferAdapter
import com.indialone.layoutpracticedemo220721.ubereats.models.DishItem
import com.indialone.layoutpracticedemo220721.ubereats.models.FoodCategory
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations

class UberEatsMainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityUberEatsMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityUberEatsMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        // image slider
        mBinding.imageSlider.setSliderAdapter(UberEatsMainSliderAdapter(this, getSliderImages()))
        mBinding.imageSlider.setIndicatorAnimation(IndicatorAnimationType.WORM)
        mBinding.imageSlider.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        mBinding.imageSlider.startAutoCycle()

        // recycler view food category
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        mBinding.rvFoodCategories.layoutManager = layoutManager
        mBinding.rvFoodCategories.adapter = RvFoodCategoryAdapter(foodCategoryList())

        // recycler view today's dishes
        val layoutManagerToday = LinearLayoutManager(this)
        layoutManagerToday.orientation = LinearLayoutManager.HORIZONTAL
        mBinding.rvTodayOffer.layoutManager = layoutManagerToday
        mBinding.rvTodayOffer.adapter = RvTodayOfferAdapter(todayDishesList())


        // recycler view family meals
        val layoutManagerFamilyMealsRv = LinearLayoutManager(this)
        layoutManagerFamilyMealsRv.orientation = LinearLayoutManager.HORIZONTAL
        mBinding.rvFamilyMeals.layoutManager = layoutManagerFamilyMealsRv
        mBinding.rvFamilyMeals.adapter = RvTodayOfferAdapter(familyMealsDishesList())

        // recycler view all dishes
        mBinding.rvAllDishes.layoutManager = LinearLayoutManager(this)
        mBinding.rvAllDishes.adapter = RvAllDishesAdapter(getAllDishes())

    }

    private fun getSliderImages(): ArrayList<Int> {
        return arrayListOf(
            R.drawable.food2,
            R.drawable.food3,
            R.drawable.food4,
            R.drawable.food5
        )
    }

    private fun foodCategoryList(): ArrayList<FoodCategory> {
        return arrayListOf(
            FoodCategory(name = "LunchBox", image = R.drawable.food_lunchbox),
            FoodCategory(name = "Hamburger", image = R.drawable.food_hamburger),
            FoodCategory(name = "McDonald's", image = R.drawable.food_mcdonalds),
            FoodCategory(name = "Restaurant", image = R.drawable.food_restaurant),
            FoodCategory(name = "Vegetarian Food", image = R.drawable.food_vegetarian_food),
            FoodCategory(name = "IceCream", image = R.drawable.food_ice_cream),
            FoodCategory(name = "French Fries", image = R.drawable.food_french_fries),
        )
    }

    private fun todayDishesList(): ArrayList<DishItem> {
        return arrayListOf(
            DishItem(
                dish_name = "Dish One",
                dish_price = "$49.99",
                dish_rating = "4.9",
                dish_is_liked = true,
                dish_on_offer = true,
                dish_image = R.drawable.dish1
            ),
            DishItem(
                dish_name = "Dish Two",
                dish_price = "$29.99",
                dish_rating = "4.4",
                dish_is_liked = true,
                dish_on_offer = false,
                dish_image = R.drawable.dish2
            ),
            DishItem(
                dish_name = "Dish Three",
                dish_price = "$99.99",
                dish_rating = "4.1",
                dish_is_liked = false,
                dish_on_offer = false,
                dish_image = R.drawable.dish3
            ),
            DishItem(
                dish_name = "Dish Four",
                dish_price = "$9.99",
                dish_rating = "4.6",
                dish_is_liked = true,
                dish_on_offer = true,
                dish_image = R.drawable.dish4
            ),
        )
    }

    private fun familyMealsDishesList(): ArrayList<DishItem> {
        return arrayListOf(
            DishItem(
                dish_name = "Dish Five",
                dish_price = "$9.99",
                dish_rating = "4.6",
                dish_is_liked = false,
                dish_on_offer = true,
                dish_image = R.drawable.dish5
            ),
            DishItem(
                dish_name = "Dish Six",
                dish_price = "$6.99",
                dish_rating = "4.8",
                dish_is_liked = true,
                dish_on_offer = false,
                dish_image = R.drawable.dish6
            ),
            DishItem(
                dish_name = "Dish Seven",
                dish_price = "$24.99",
                dish_rating = "4.3",
                dish_is_liked = true,
                dish_on_offer = true,
                dish_image = R.drawable.dish7
            ),
            DishItem(
                dish_name = "Dish Eight",
                dish_price = "$249.99",
                dish_rating = "4.6",
                dish_is_liked = false,
                dish_on_offer = false,
                dish_image = R.drawable.dish8
            )
        )
    }

    private fun getAllDishes(): ArrayList<DishItem> {
        return arrayListOf(
            DishItem(
                dish_name = "Dish Nine",
                dish_price = "$19.99",
                dish_rating = "4.6",
                dish_is_liked = false,
                dish_on_offer = true,
                dish_image = R.drawable.dish9
            ),
            DishItem(
                dish_name = "Dish Ten",
                dish_price = "$16.99",
                dish_rating = "4.0",
                dish_is_liked = false,
                dish_on_offer = false,
                dish_image = R.drawable.dish10
            ),
            DishItem(
                dish_name = "Dish Eleven",
                dish_price = "$24.99",
                dish_rating = "4.1",
                dish_is_liked = true,
                dish_on_offer = true,
                dish_image = R.drawable.dish11
            ),
            DishItem(
                dish_name = "Dish Twelve",
                dish_price = "$29.99",
                dish_rating = "4.6",
                dish_is_liked = true,
                dish_on_offer = false,
                dish_image = R.drawable.dish13
            ),
        )
    }

}