package com.example.darfe.tablet

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container1, ColorFragment.instance(ColorFragment.BLUE))
            .add(R.id.container2, ColorFragment.instance(ColorFragment.RED))
            .commit()

    }
}
