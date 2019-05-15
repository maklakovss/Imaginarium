package com.mss.imaginarium


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TwoFragment : Fragment() {

    companion object {
        public fun newInstance(bundle: Bundle): TwoFragment {
            return TwoFragment().apply {
                arguments = Bundle().apply { putBundle("gettedArgs", bundle) }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }


}
