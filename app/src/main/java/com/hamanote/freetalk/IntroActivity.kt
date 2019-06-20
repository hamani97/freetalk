package com.hamanote.freetalk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intro.*

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        tv_app_version.text = "v" + this.packageManager.getPackageInfo(this.packageName, 0).versionName

        Handler().postDelayed({
            moveToNext()
        }, 800)
    }

    private fun moveToNext() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
