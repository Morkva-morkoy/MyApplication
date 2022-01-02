package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var but: RelativeLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but = findViewById(R.id.description)


        var url = URL("https://maps.googleapis.com/maps/api/place/findplacefromtext/json?input=INPUT%20INPUT&inputtype=textquery&fields=formatted_address%2Cname%2Crating%2Copening_hours%2Cgeometry&key=AIzaSyBZ3qf0Ir4UFjBREN3bzkPG4fm0KWbk83o" ).readText()

    }
}