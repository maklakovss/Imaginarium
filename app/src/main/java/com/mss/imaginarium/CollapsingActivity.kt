package com.mss.imaginarium

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class CollapsingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing)
        findViewById<Toolbar>(R.id.toolBar).let {
            setSupportActionBar(it)
        }
    }
}
