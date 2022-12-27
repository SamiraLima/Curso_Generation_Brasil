package com.example.ex_activities_navegacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.buttonNext)

        val intentSegunda = Intent(this, SegundaActivity:: class.java)

        buttonNext.setOnClickListener {
            startActivity(intentSegunda)
        }
    }
}