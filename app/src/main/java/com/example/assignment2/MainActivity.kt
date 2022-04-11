package com.example.assignment2

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag : String = "Cash donation"
        val spinnerVal : Spinner = findViewById(R.id.spinner)
        var options = arrayOf("Cash donation","Gift in kinds","Gifts of Certified Cultural Property")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { view ->
            var dialog=dialgfrag()
            dialog.show(supportFragmentManager, "Custom Dialog")

        }
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 -> Toast.makeText(this, "Pls send us an email at : cahrity.donation@gamil.com", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "We are a donation charity that helps people around the world", Toast.LENGTH_SHORT).show()

        }
        return true;
    }



    }