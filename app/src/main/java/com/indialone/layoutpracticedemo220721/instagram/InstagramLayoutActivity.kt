package com.indialone.layoutpracticedemo220721.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityInstagramLayoutBinding

class InstagramLayoutActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityInstagramLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityInstagramLayoutBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        mBinding.rvStatus.layoutManager = layoutManager
        mBinding.rvStatus.adapter = StatusRvAdapter(getStatusList())

        mBinding.rvPosts.layoutManager = LinearLayoutManager(this)
        mBinding.rvPosts.adapter = PostRvAdapter(getPostList())

    }

    fun getStatusList(): ArrayList<StatusItem> {
        return arrayListOf(
            StatusItem(R.drawable.master_poster, "Your Story"),
            StatusItem(R.drawable.image_rdj, "Robert Downey Jr"),
            StatusItem(R.drawable.image_christian_bale, "Christian Bale"),
            StatusItem(R.drawable.image_johny_depp, "Johny Depp"),
            StatusItem(R.drawable.image_leonardo, "Leonardo De Caprio"),
            StatusItem(R.drawable.image_allu_arjun, "Allu Arjun"),
            StatusItem(R.drawable.image_akshay, "Akshay Kumar"),
            StatusItem(R.drawable.image_kajal, "Kajal Agrawal"),
            StatusItem(R.drawable.image_rashmika, "Rashmika Mandana"),
        )
    }

    fun getSuggestionList1(): ArrayList<StatusItem> {
        return arrayListOf(
            StatusItem(R.drawable.master_poster, "Master Movie"),
            StatusItem(R.drawable.image_rdj, "Robert Downey Jr"),
            StatusItem(R.drawable.image_christian_bale, "Christian Bale"),
            StatusItem(R.drawable.image_johny_depp, "Johny Depp")

        )
    }

    fun getSuggestionList2(): ArrayList<StatusItem> {
        return arrayListOf(
            StatusItem(R.drawable.image_leonardo, "Leonardo De Caprio"),
            StatusItem(R.drawable.image_allu_arjun, "Allu Arjun"),
            StatusItem(R.drawable.image_akshay, "Akshay Kumar"),
            StatusItem(R.drawable.image_kajal, "Kajal Agrawal"),
            StatusItem(R.drawable.image_rashmika, "Rashmika Mandana")
        )
    }

    fun getPostList(): ArrayList<Any> {
        return arrayListOf(
            PostItem(
                "Master Movie",
                "Tamilnadu, India",
                R.drawable.master_vijay,
                R.drawable.master_poster,
                "1B likes",
                "26 Jan, 2021"
            ),
            SuggestedItem(getSuggestionList1()),
            PostItem(
                "Emirates Palace Abu Dhabi",
                "Abudhabi, Dubai",
                R.drawable.image_rdj,
                R.drawable.emirates_palace_abu_dhabi,
                "1M likes",
                "15 Jan, 2019"
            ),
            PostItem(
                "Inception Movie",
                "Hollywood, USA",
                R.drawable.image_leonardo,
                R.drawable.movie_inception,
                "10B likes",
                "15 Jan, 2005"
            ),
            SuggestedItem(getSuggestionList2()),
            PostItem(
                "Pirates Of Caribbean On Stranger Tides",
                "Hollywood, USA",
                R.drawable.image_johny_depp,
                R.drawable.movie_pirates_of_carribbean,
                "50B likes",
                "15 Jan, 20018"
            )
        )
    }

}