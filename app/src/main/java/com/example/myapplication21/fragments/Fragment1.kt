package com.example.myapplication21.fragments
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication21.R

class fragment1 : Fragment(R.layout.fragment_1){

    lateinit var editText : EditText
    lateinit var button : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editText)
        button = view.findViewById(R.id.button)

        val navController = Navigation.findNavController(view)
        button.setOnClickListener {
            val text = editText.text.toString()
            val action = fragment1Directions.actionFragment1ToFragment2(text)
            navController.navigate(action)

        }

    }
}