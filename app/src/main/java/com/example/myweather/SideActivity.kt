package com.example.myweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side)

        val detailButton2 = findViewById<Button>(R.id.detailButton2)
        detailButton2.setOnClickListener {
            val intent = Intent( this, MainScreen::class.java)
            startActivity(intent) }
    }
}