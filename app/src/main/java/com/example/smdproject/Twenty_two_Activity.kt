package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Twenty_two_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_twenty_two)

        // Apply window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the text views
        val tvFollowing = findViewById<TextView>(R.id.FollowingBar)
        val tvYou = findViewById<TextView>(R.id.YouBar)

        // "Following" → Go to Activity_TwentyOne
        tvFollowing.setOnClickListener {
            val intent = Intent(this, Twenty_one_Activity::class.java)
            startActivity(intent)
        }

        // "You"
        tvYou.setOnClickListener {
        }
    }
}
