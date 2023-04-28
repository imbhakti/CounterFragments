package com.test.fragments1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment :Fragment() {
    private lateinit var txtCount: TextView
    private lateinit var btnDecrement: Button
    private lateinit var btnIncrement: Button

    var count = 0
        set(value) {
            field = value
            txtCount.text = "$count"
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.counter_fragment, null)
        initViews(view)
        setUpListeners()
        return view
    }
    private fun setUpListeners(){
        btnDecrement.setOnClickListener {
            txtCount.text = "${--count}"

        }
        btnIncrement.setOnClickListener {
            txtCount.text = "${++count}"

        }

    }
    private fun initViews(view: View){
        txtCount = view.findViewById(R.id.txtCount)
        btnDecrement = view.findViewById(R.id.btnDecrement)
        btnIncrement = view.findViewById(R.id.btnIncrement)

    }
}