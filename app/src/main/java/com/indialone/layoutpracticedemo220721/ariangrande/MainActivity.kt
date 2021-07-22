package com.indialone.layoutpracticedemo220721.ariangrande

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityMainBinding
import com.indialone.layoutpracticedemo220721.ariangrande.models.Album
import com.indialone.layoutpracticedemo220721.ariangrande.models.Music

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        supportActionBar!!.hide()

        val horizontalLayoutManager = LinearLayoutManager(this)
        horizontalLayoutManager.orientation = LinearLayoutManager.HORIZONTAL

        mBinding.recyclerviewHorizontal.layoutManager = horizontalLayoutManager
        mBinding.recyclerviewHorizontal.adapter = RvHorizontalAdapter(getAlbums())

        val verticalLayoutManager = LinearLayoutManager(this)
        verticalLayoutManager.orientation = LinearLayoutManager.VERTICAL

        mBinding.recyclerviewVertical.layoutManager = verticalLayoutManager
        mBinding.recyclerviewVertical.adapter = RvVerticalAdapter(getSongs())

    }

    fun getAlbums(): ArrayList<Album> {
        return arrayListOf(
            Album(image = R.drawable.image1, "Album 1"),
            Album(image = R.drawable.image2, "Album 2"),
            Album(image = R.drawable.image3, "Album 3"),
            Album(image = R.drawable.image1, "Album 1"),
            Album(image = R.drawable.image2, "Album 2"),
            Album(image = R.drawable.image3, "Album 3"),
        )
    }

    fun getSongs(): ArrayList<Music> {
        return arrayListOf(
            Music("#1", R.drawable.song1, "Song 1", "This is a first song"),
            Music("#2", R.drawable.song2, "Song 2", "This is a second song"),
            Music("#3", R.drawable.song3, "Song 3", "This is a third song"),
            Music("#4", R.drawable.song4, "Song 4", "This is a fourth song"),
            Music("#1", R.drawable.song1, "Song 1", "This is a first song"),
            Music("#2", R.drawable.song2, "Song 2", "This is a second song"),
            Music("#3", R.drawable.song3, "Song 3", "This is a third song"),
            Music("#4", R.drawable.song4, "Song 4", "This is a fourth song")
        )
    }

}