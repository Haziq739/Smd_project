package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Eight_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eight)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find username TextViews
        val andrewName = findViewById<TextView>(R.id.firstId_name)   // top bar username
        val ellisName = findViewById<TextView>(R.id.secondId_name)   // replace with real id
        val jackName = findViewById<TextView>(R.id.thirdId_name)    // replace with real id
        val williamName = findViewById<TextView>(R.id.fourthId_name) // replace with real id

        // Common click listener
        val navigateToTwenty = {
            val intent = Intent(this, Twenty_Activity::class.java)
            startActivity(intent)
        }

        // Attach listeners
        andrewName.setOnClickListener { navigateToTwenty() }
        ellisName.setOnClickListener { navigateToTwenty() }
        jackName.setOnClickListener { navigateToTwenty() }
        williamName.setOnClickListener { navigateToTwenty() }
    }
}
