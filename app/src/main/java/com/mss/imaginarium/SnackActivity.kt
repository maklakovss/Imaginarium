package com.mss.imaginarium

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class SnackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack)
        val btnShowSnack = findViewById<Button>(R.id.btnShowSnack)
        btnShowSnack.setOnClickListener {
            Snackbar.make(it, R.string.snack_text, Snackbar.LENGTH_LONG).let {
                it.setAction(R.string.snack_action_text, {
                    Toast.makeText(this, R.string.toast_text, Toast.LENGTH_SHORT).show()
                })
                it.show()
            }
        }
    }
}
