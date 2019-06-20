package com.hamanote.freetalk.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

open class BaseFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    protected open fun initViews() {}
    open fun onSelected() {}
}