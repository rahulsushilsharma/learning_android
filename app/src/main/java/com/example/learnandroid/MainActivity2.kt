package com.example.learnandroid

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity2 : AppCompatActivity() {
    private var mediaPlayer : MediaPlayer? = null;
    private lateinit var seekBar : SeekBar;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var button = findViewById<Button>(R.id.play)
        var pause = findViewById<FloatingActionButton>(R.id.iconPause)
        var play = findViewById<FloatingActionButton>(R.id.iconPlay)
        var stop = findViewById<FloatingActionButton>(R.id.iconStop)
        seekBar = findViewById(R.id.seekBar)

        play.setOnClickListener {
            if(mediaPlayer==null) {
                mediaPlayer = MediaPlayer.create(this, R.raw.audio)
            }
            mediaPlayer?.start()
        }
        pause.setOnClickListener {
            mediaPlayer?.pause()
        }
        stop.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.reset();
            mediaPlayer?.release();
            mediaPlayer = null

        }
    }
    private fun initlizeSeeKBar(){
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

        })
    }
}