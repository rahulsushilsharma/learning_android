package com.example.learnandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textVi = findViewById<TextView>(R.id.textView)
        val inp = findViewById<EditText>(R.id.editTextText)
        val butt = findViewById<Button>(R.id.button)

        butt.setOnClickListener{
            if(inp.text.toString() == ""){
                textVi.text = ""
                Toast.makeText(this@MainActivity,"Please enter your name",Toast.LENGTH_SHORT).show()
            }else {
                val msg = "Welcome ${inp.text.toString()}";
                textVi.text = msg;
                inp.text.clear();
            }
        }

    }
}