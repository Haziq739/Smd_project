package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Button
import androidx.core.view.WindowInsetsCompat

class Seventeen_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_seventeen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔹 Find "Your Stories" box
        val yourStoriesBox = findViewById<Button>(R.id.your_stories_button)

        // 🔹 Navigate to Eighteen_Activity on click
        yourStoriesBox.setOnClickListener {
            val intent = Intent(this@Seventeen_Activity, Eighteen_Activity::class.java)
            startActivity(intent)
        }
    }
}
