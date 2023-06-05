package com.example.learnandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
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
        val butt1 = findViewById<Button>(R.id.button2)
        var userName = ""
        butt.setOnClickListener{
            if(inp.text.toString() == ""){
                textVi.text = ""
                Toast.makeText(this@MainActivity,"Please enter your name",Toast.LENGTH_SHORT).show()
                butt1.visibility = INVISIBLE
            }else {
                userName = inp.text.toString()
                val msg = "Welcome $userName";
                textVi.text = msg;
                inp.text.clear();
                butt1.visibility = VISIBLE
            }
        }
        butt1.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",userName)
            startActivity(intent)
        }

    }
}