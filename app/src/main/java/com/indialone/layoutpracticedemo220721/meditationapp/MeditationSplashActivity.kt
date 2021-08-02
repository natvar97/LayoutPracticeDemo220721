package com.indialone.layoutpracticedemo220721.meditationapp

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Pair
import android.view.View
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import androidx.annotation.RequiresApi
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityMeditationSplashBinding

class MeditationSplashActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMeditationSplashBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMeditationSplashBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MeditationSplashActivity, MeditationAfterSplashActivity::class.java)
            val actions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair<View,String>(mBinding.ivMeditationLogo,"transition_logo")
            )
            startActivity(intent, actions.toBundle())
            finish()
        }, 2000)


    }
}