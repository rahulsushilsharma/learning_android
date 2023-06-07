package com.example.learnandroid

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MY MSG" , "sec activity : onCreate")

        val userName = intent.getStringExtra("USER")
        val text3 = findViewById<TextView>(R.id.textView3)
        text3.text = userName;
    }
    override fun onStart() {
        super.onStart()
        Log.i("MY MSG" , "sec activity : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MY MSG" , "sec activity : onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MY MSG" , "sec activity : onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MY MSG" , "sec activity : onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY MSG" , "sec activity : onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY MSG" , "sec activity : onRestart")

    }

}