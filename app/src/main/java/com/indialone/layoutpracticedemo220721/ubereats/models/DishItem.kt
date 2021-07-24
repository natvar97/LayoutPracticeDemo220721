package com.indialone.layoutpracticedemo220721.ubereats.models

data class DishItem(
    var dish_name: String = "",
    var dish_price: String = "",
    var dish_rating: String = "",
    var dish_is_liked: Boolean = false,
    var dish_on_offer: Boolean = false,
    var dish_image: Int = 0
)
