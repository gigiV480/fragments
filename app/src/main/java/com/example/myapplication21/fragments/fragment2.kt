package com.example.myapplication21.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication21.R

class fragment2 : Fragment(R.layout.fragment_2) {

    lateinit var textView : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)
        textView.text = fragment2Args.fromBundle(requireArguments()).text

    }

}