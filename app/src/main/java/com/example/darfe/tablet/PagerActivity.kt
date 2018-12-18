package com.example.darfe.tablet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.darfe.tablet.adapters.ColorAdapter
import kotlinx.android.synthetic.main.activity_pager.*

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)

        pager.adapter = ColorAdapter(this, supportFragmentManager)
        tabs.setupWithViewPager(pager)
    }
}
