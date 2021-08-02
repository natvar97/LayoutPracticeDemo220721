package com.indialone.layoutpracticedemo220721.meditationapp

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import android.view.View
import androidx.annotation.RequiresApi
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.ActivityMeditationAfterSplashBinding

class MeditationAfterSplashActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMeditationAfterSplashBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMeditationAfterSplashBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.btnLogin.setOnClickListener {
            val intent = Intent(this, MeditationLoginActivity::class.java)
            val actions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair<View,String>(mBinding.ivMeditationLogo,"transition_logo")
            )
            startActivity(intent, actions.toBundle())
        }

        mBinding.tvSignUp.setOnClickListener {
            val intent = Intent(this, MeditationSignUpActivity::class.java)
            val actions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair<View,String>(mBinding.ivMeditationLogo,"transition_logo")
            )
            startActivity(intent, actions.toBundle())
        }

    }
}