package com.mss.imaginarium

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.MenuItem

class ToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        findViewById<Toolbar>(R.id.toolBar).let {
            setSupportActionBar(it)
            supportActionBar?.let {
                it.setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                Log.d("TAG", "backClicked")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}
