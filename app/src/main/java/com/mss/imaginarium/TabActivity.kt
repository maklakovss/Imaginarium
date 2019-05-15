package com.mss.imaginarium

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tab.*

class TabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab)

        viewPager.adapter = PagesAdapter(supportFragmentManager).apply {
            addFragment(OneFragment(), "tab1")
            addFragment(TwoFragment(), "tab2")
            addFragment(ThreeFragment(), "tab3")
        }
        tabLayout.setupWithViewPager(viewPager)
    }

}
