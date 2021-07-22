package com.indialone.layoutpracticedemo220721.profilesettings

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import androidx.annotation.RequiresApi
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityProfileSettingsBinding
import com.indialone.layoutpracticedemo220721.equalizer.EqualizerActivity

class ProfileSettingsActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityProfileSettingsBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityProfileSettingsBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        supportActionBar!!.hide()

        mBinding.tvEqualizer.setOnClickListener {
            val intent = Intent(this, EqualizerActivity::class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair(mBinding.tvEqualizer, "text_equalizer")
            )

            startActivity(intent, options.toBundle())


        }

    }
}