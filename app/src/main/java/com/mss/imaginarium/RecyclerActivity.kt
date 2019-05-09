package com.mss.imaginarium

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        rvImagesList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvImagesList.adapter = ImagesAdapter()
//        rvImagesList.setHasFixedSize(true)
    }
}
