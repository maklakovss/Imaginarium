package com.mss.imaginarium

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_images.*
import kotlinx.android.synthetic.main.app_bar_images.*
import kotlinx.android.synthetic.main.content_images.*

class ImagesActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    companion object {

        private val fruitsAdapter: ImagesAdapter
        private val vegetablesAdapter: ImagesAdapter
        private val naturesAdapter: ImagesAdapter
        private var currentAdapter: ImagesAdapter

        init {
            val fruitsList = arrayListOf<ImageInfo>()
            fruitsList.add(ImageInfo("Яблоко", R.drawable.apple))
            fruitsList.add(ImageInfo("Ананас", R.drawable.pineapple))
            fruitsList.add(ImageInfo("Кокос", R.drawable.cocos))
            fruitsAdapter = ImagesAdapter(fruitsList)

            currentAdapter = fruitsAdapter

            val vegetablesList = arrayListOf<ImageInfo>()
            vegetablesList.add(ImageInfo("Морковь", R.drawable.carrots))
            vegetablesList.add(ImageInfo("Помидор", R.drawable.tomatos))
            vegetablesList.add(ImageInfo("Капуста", R.drawable.cabbges))
            vegetablesAdapter = ImagesAdapter(vegetablesList)

            val naturesList = arrayListOf<ImageInfo>()
            naturesList.add(ImageInfo("Природа1", R.drawable.nature1))
            naturesList.add(ImageInfo("Природа2", R.drawable.nature2))
            naturesList.add(ImageInfo("Природа3", R.drawable.nature3))
            naturesAdapter = ImagesAdapter(naturesList)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG).show() }

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        rvImages.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvImages.adapter = currentAdapter

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_fruits -> {
                changeAdapter(fruitsAdapter)
            }
            R.id.nav_vegetables -> {
                changeAdapter(vegetablesAdapter)
            }
            R.id.nav_nature -> {
                changeAdapter(naturesAdapter)
            }
            R.id.nav_exit -> {
                super.onBackPressed()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun changeAdapter(adapter: ImagesAdapter) {
        currentAdapter = adapter
        rvImages.adapter = currentAdapter
    }
}
