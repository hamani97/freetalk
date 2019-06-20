package com.hamanote.freetalk.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hamanote.freetalk.R
import com.hamanote.freetalk.base.BaseFragment

class FavoriteFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }
    override fun initViews() {
    }
}