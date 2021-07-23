package com.indialone.layoutpracticedemo220721.homepageinsta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityInstaHomePageBinding

class InstaHomePageActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityInstaHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityInstaHomePageBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val fragments = arrayListOf(
            UploadsFragment(),
            PostsFragment()
        )

        mBinding.viewpager.adapter = ViewPagerAdapter(fragments, this)
        mBinding.viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val tabIcons = arrayListOf(
            ContextCompat.getDrawable(this, R.drawable.icon_window),
            ContextCompat.getDrawable(this, R.drawable.instagram_logo),
        )

        TabLayoutMediator(mBinding.tabLayout, mBinding.viewpager) { tab, position ->
            tab.icon = tabIcons[position]
        }.attach()

    }
}