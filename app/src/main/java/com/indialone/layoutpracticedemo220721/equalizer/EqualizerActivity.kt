package com.indialone.layoutpracticedemo220721.equalizer

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import androidx.annotation.RequiresApi
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.ariangrande.MainActivity
import com.indialone.layoutpracticedemo220721.databinding.ActivityEqualizerBinding

class EqualizerActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityEqualizerBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityEqualizerBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        supportActionBar!!.hide()

        mBinding.tvBack.setOnClickListener { onBackPressed() }

        mBinding.btnSave.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(mBinding.btnSave, "buttonTransition")
            )

            startActivity(intent, options.toBundle())
        }


    }
}