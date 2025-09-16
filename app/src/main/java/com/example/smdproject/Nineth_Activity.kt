package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Nineth_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nineth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔹 Video call icon → Go to Tenth_Activity
        val videoCallIcon = findViewById<ImageView>(R.id.videoCallIcon)
        videoCallIcon.setOnClickListener {
            val intent = Intent(this, Tenth_Activity::class.java)
            startActivity(intent)
        }

        // 🔹 Back button icon (top-left arrow) → Go to Seventh_Activity
        val backButton = findViewById<ImageView>(R.id.middle_leftArrowSection)
        backButton.setOnClickListener {
            val intent = Intent(this, Seventh_Activity::class.java)
            startActivity(intent)
            finish() // optional: closes current activity
        }
    }
}
