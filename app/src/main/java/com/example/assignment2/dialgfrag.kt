package com.example.assignment2
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

    class dialgfrag: DialogFragment(R.layout.dialgfrag_custom) {
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            val cancelbt : Button = view.findViewById(R.id.cancel);
            val submitbt : Button = view.findViewById(R.id.Donate);
            val radioGroup = requireView().findViewById<RadioGroup>(R.id.radioGroup)

            cancelbt.setOnClickListener{
                dismiss()
            }

            submitbt.setOnClickListener {
                val selectedOption: Int = radioGroup.checkedRadioButtonId
                val radioButton = view.findViewById<RadioButton>(selectedOption)
                Toast.makeText(context,radioButton.text,Toast.LENGTH_SHORT).show()
                Toast.makeText(context,"Thanks for saving a life ♥",Toast.LENGTH_SHORT).show()
                dismiss()
            }



        }
    }


