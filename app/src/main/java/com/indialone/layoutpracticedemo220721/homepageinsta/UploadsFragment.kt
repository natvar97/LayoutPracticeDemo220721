package com.indialone.layoutpracticedemo220721.homepageinsta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.indialone.layoutpracticedemo220721.R
import com.indialone.layoutpracticedemo220721.databinding.FragmentUploadsBinding

class UploadsFragment : Fragment() {

    private lateinit var mBinding: FragmentUploadsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentUploadsBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = GridLayoutManager(mBinding.root.context, 3)

        mBinding.rvUploads.layoutManager = layoutManager
        mBinding.rvUploads.adapter = UploadsRvAdapter(getPostsList())

    }

    private fun getPostsList(): ArrayList<Int> {
        return arrayListOf(
            R.drawable.emirates_palace_abu_dhabi,
            R.drawable.master_poster,
            R.drawable.master_malavika,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image_akshay,
            R.drawable.image_allu_arjun,
            R.drawable.image_christian_bale,
            R.drawable.image_johny_depp,
            R.drawable.image_kajal,
            R.drawable.image_rashmika,
            R.drawable.image_rdj,
            R.drawable.image_leonardo,
            R.drawable.master_vijay,
            R.drawable.master_arjun_das,
            R.drawable.master_vijay_sethupati,
            R.drawable.master_andrea,
            R.drawable.courtyard_by_marriott_hotel,
            R.drawable.hyatt_regency,
            R.drawable.double_tree_by_hilton,
            R.drawable.renaissance_hotel,
        )
    }

}