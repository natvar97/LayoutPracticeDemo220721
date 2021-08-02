package com.indialone.layoutpracticedemo220721.meditationapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.indialone.layoutpracticedemo220721.databinding.FragmentAccoutBinding

class AccountFragment : Fragment() {

    private var mBinding: FragmentAccoutBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentAccoutBinding.inflate(inflater, container, false)
        return mBinding!!.root
    }

}