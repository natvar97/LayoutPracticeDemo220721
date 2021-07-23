package com.indialone.layoutpracticedemo220721.instagram

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.graphics.TypefaceCompat

class TextViewInsta(context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {

    init {
        applyFont()
    }

    private fun applyFont() {
        val typeFace = Typeface.createFromAsset(context.assets, "Roboto-Italic.ttf")
        typeface = typeFace
    }

}