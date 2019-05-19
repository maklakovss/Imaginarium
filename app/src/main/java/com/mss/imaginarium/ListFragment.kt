package com.mss.imaginarium

import android.support.v4.app.Fragment

class ListFragment:Fragment() {

    companion object{
        private val instance:ListFragment by lazy { ListFragment() }
        fun INSTANCE() = instance
    }

}