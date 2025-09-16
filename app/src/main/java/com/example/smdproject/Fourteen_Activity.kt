package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Fourteen_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourteen)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔹 Find img_33 (birds image)
        val birdImage = findViewById<ImageView>(R.id.bird_img)

        // 🔹 Set navigation to Seventeen_Activity when clicked
        birdImage.setOnClickListener {
            val intent = Intent(this@Fourteen_Activity, Seventeen_Activity::class.java)
            startActivity(intent)
        }
    }
}
