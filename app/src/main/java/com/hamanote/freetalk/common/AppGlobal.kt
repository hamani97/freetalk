package com.hamanote.freetalk.common

import android.content.Context

class AppGlobal private constructor() {
    private var _context : Context? = null

    private object Holder { val INSTANCE = AppGlobal() }

    companion object {
        val instance: AppGlobal by lazy { Holder.INSTANCE }
    }
    fun setContext(ctx : Context) { _context = ctx }
}