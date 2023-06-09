package com.example.learnandroid

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var sp: SharedPreferences;
    private lateinit var editor: SharedPreferences.Editor;
    private lateinit var textVi: TextView
    private lateinit var inp: EditText
    private lateinit var butt: Button
    private lateinit var butt1: Button
    private lateinit var butt2: Button
    private lateinit var userName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textVi = findViewById<TextView>(R.id.textView)
        inp = findViewById<EditText>(R.id.editTextText)
        butt = findViewById<Button>(R.id.button)
        butt1 = findViewById<Button>(R.id.button2)
        butt2 = findViewById(R.id.mediaButton1)
        userName = ""
        sp = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sp.edit()
        Log.i("MY MSG", "main activity : onCreate")
        butt.setOnClickListener {
            if (inp.text.toString() == "") {
                textVi.text = ""
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()
                butt1.visibility = INVISIBLE
            } else {
                userName = inp.text.toString()
                val msg = "Welcome $userName";
                textVi.text = msg;
                inp.text.clear();
                butt1.visibility = VISIBLE
            }
        }
        butt1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", userName)
            startActivity(intent)
        }

        butt2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
//            intent.putExtra("USER", userName)
            startActivity(intent)
        }



    }

    override fun onStart() {
        super.onStart()
        Log.i("MY MSG", "main activity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MY MSG", "main activity : onResume")
        val name = sp.getString("sp_name",null)
        textVi.text = name;
        inp.setText(name)
    }

    override fun onPause() {
        super.onPause()
        Log.i("MY MSG", "main activity : onPause")
        try {
            val name = userName
            editor.apply{
            putString("sp_name", name);
            commit();
            }
        }catch (err:Throwable){
            Log.i("err",err.toString())
            inp.setText(err.toString())
        }


    }

    override fun onStop() {
        super.onStop()
        Log.i("MY MSG", "main activity : onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY MSG", "main activity : onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY MSG", "main activity : onRestart")

    }

}