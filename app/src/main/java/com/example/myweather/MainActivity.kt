package com.example.myweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainbutton = findViewById<Button>(R.id.mainbutton)
        mainbutton.setOnClickListener {
            val intent = Intent( this, SideActivity::class.java)
            startActivity(intent) }
    }
}