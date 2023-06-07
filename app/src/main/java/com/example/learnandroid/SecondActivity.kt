package com.example.learnandroid

import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var waight:EditText
    private lateinit var height:EditText
    private lateinit var button:Button
    private lateinit var result:TextView
    private lateinit var resCard: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MY MSG" , "sec activity : onCreate")
        waight = findViewById(R.id.wInput)
        height = findViewById(R.id.hInput)
        result = findViewById(R.id.res)
        button = findViewById(R.id.button3)
        resCard = findViewById(R.id.cvOut)

        val userName = intent.getStringExtra("USER")
        val text3 = findViewById<TextView>(R.id.textView3)
        text3.text = userName;

        button.setOnClickListener {
            val w = waight.text.toString().toInt()
            val h = height.text.toString().toInt()
            val bmi = w / (h*h);
            result.text = "${bmi.toString()}Kg/m2 "
            resCard.visibility = VISIBLE
            result.setTextColor(ContextCompat.getColor(this,R.color.fire_brick))
            Toast.makeText(this@SecondActivity,"You fat bitch!",Toast.LENGTH_LONG).show()
        }

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