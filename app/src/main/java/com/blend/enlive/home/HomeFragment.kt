package com.blend.enlive.home

import android.os.Bundle
import com.blend.base.common.ui.BaseFragment
import com.blend.enlive.R
import com.blend.enlive.databinding.FragmentHomeBinding


class HomeFragment :BaseFragment<HomeViewModel,FragmentHomeBinding>() {

    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initView(savedInstanceState: Bundle?) {

    }


}