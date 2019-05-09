package com.mss.imaginarium

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener(this)
        btnClose.setOnClickListener { finish() }
    }

    override fun onClick(view: View) {
        val name = etLogin.text.toString()
        if (name.trim().isNotEmpty()) {
            startActivity(Intent(this, ImagesActivity::class.java))
        } else {
            Snackbar.make(view, R.string.empty_name_message, Snackbar.LENGTH_SHORT).show()
        }
    }
}
