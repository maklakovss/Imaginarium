package com.mss.imaginarium

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        val ilName = findViewById<TextInputLayout>(R.id.ilName)
        val etName = findViewById<EditText>(R.id.etName)
        etName.setOnEditorActionListener(TextView.OnEditorActionListener { textView, i, keyEvent ->
            if (textView.text.toString().length < 4)
                ilName.error = "length < 4"
            else
                ilName.error = ""
            return@OnEditorActionListener false
        })
    }
}
