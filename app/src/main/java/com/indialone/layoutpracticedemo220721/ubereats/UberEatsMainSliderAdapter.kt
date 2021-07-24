package com.indialone.layoutpracticedemo220721.ubereats

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.indialone.layoutpracticedemo220721.R
import com.smarteist.autoimageslider.SliderViewAdapter

class UberEatsMainSliderAdapter(
    private var context: Context,
    private var mSliderItems: ArrayList<Int>
) :
    SliderViewAdapter<UberEatsMainSliderAdapter.SliderAdapterVH>() {
//    private var mSliderItems: MutableList<Int> = ArrayList()
//    fun renewItems(sliderItems: MutableList<Int>) {
//        mSliderItems = sliderItems
//        notifyDataSetChanged()
//    }
//
//    fun deleteItem(position: Int) {
//        mSliderItems.removeAt(position)
//        notifyDataSetChanged()
//    }
//
//    fun addItem(sliderItem: Int) {
//        mSliderItems.add(sliderItem)
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.image_slider_layout_item, parent, false)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH, position: Int) {
        val sliderItem: Int = mSliderItems[position]
//        viewHolder.textViewDescription.setText(sliderItem.getDescription())
//        viewHolder.textViewDescription.textSize = 16f
//        viewHolder.textViewDescription.setTextColor(Color.WHITE)
        Glide.with(viewHolder.itemView)
            .load(sliderItem)
            .fitCenter()
            .into(viewHolder.imageViewBackground)
        viewHolder.itemView.setOnClickListener {
            Toast.makeText(context, "This is item in position $position", Toast.LENGTH_SHORT)
                .show()
        }
    }

    override fun getCount(): Int {
        //slider view count could be dynamic size
        return mSliderItems.size
    }

    inner class SliderAdapterVH(itemView: View) : ViewHolder(itemView) {
        //        var imageGifContainer: ImageView
//        var textViewDescription: TextView
        var imageViewBackground = itemView.findViewById<ImageView>(R.id.iv_auto_image_slider)


    }

}
