package com.example.myweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    val heat = arrayListOf<Int>(25,28,24,22,26,28,27)
    val cold = arrayListOf<Int>(16,18,16,14,17,19,18)
    val conditons = arrayListOf<String>("Sunny","Clear Sky","Clear Sky","Cloudy","Sunny","Clear Sky","Sunny")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val maxTeperatur = findViewById<TextView>(R.id.maxTeperatur)
        val lowTemp = findViewById<TextView>(R.id.lowTemp)
        val conDi = findViewById<TextView>(R.id.conDi)

        var weatherDisplay = ""
        weatherDisplay += "${heat[0]}\n"
        weatherDisplay += "${heat[1]}\n"
        weatherDisplay += "${heat[2]}\n"
        weatherDisplay += "${heat[3]}\n"
        weatherDisplay += "${heat[4]}\n"
        weatherDisplay += "${heat[5]}\n"
        weatherDisplay += "${heat[6]}\n"

        maxTeperatur.text= weatherDisplay

        var tempView = ""
        tempView += "${cold[0]}\n"
        tempView += "${cold[1]}\n"
        tempView += "${cold[2]}\n"
        tempView += "${cold[3]}\n"
        tempView += "${cold[4]}\n"
        tempView += "${cold[5]}\n"
        tempView += "${cold[6]}\n"

        lowTemp.text= tempView

        var condtionView =""
        condtionView += "${conditons[0]}\n"
        condtionView += "${conditons[1]}\n"
        condtionView += "${conditons[2]}\n"
        condtionView += "${conditons[3]}\n"
        condtionView += "${conditons[4]}\n"
        condtionView += "${conditons[5]}\n"
        condtionView += "${conditons[6]}\n"

        conDi.text= condtionView


    }
}