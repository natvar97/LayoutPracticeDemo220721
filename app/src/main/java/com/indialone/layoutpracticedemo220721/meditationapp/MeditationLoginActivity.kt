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
import com.indialone.layoutpracticedemo220721.databinding.ActivityMeditationLoginBinding

class MeditationLoginActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMeditationLoginBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMeditationLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.tvSignUp.setOnClickListener {
            val intent = Intent(this, MeditationSignUpActivity::class.java)
            val actions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair<View,String>(mBinding.meditationLogo,"transition_logo")
            )
            startActivity(intent, actions.toBundle())
        }

        mBinding.btnLogin.setOnClickListener {
            val intent = Intent(this, MeditationHomeActivity::class.java)
            val actions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair<View,String>(mBinding.meditationLogo,"transition_logo")
            )
            startActivity(intent, actions.toBundle())
        }

    }
}