package com.indialone.layoutpracticedemo220721.meditationapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.indialone.layoutpracticedemo220721.databinding.FragmentPlaylistBinding

class PlaylistFragment : Fragment() {

    private var mBinding: FragmentPlaylistBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentPlaylistBinding.inflate(inflater, container, false)
        return mBinding!!.root
    }

}