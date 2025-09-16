package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class Fifth_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find views
        val searchIcon = findViewById<ImageView>(R.id.search_icon_1)
        val plusIcon = findViewById<ImageView>(R.id.reel_icon)  // using reel as your + button
        val heartIcon = findViewById<ImageView>(R.id.heart_icon_1)
        val profileIcon = findViewById<CircleImageView>(R.id.view_circle_7)
        val yourStoryIcon = findViewById<CircleImageView>(R.id.view_circle_1) // Your Story
        val camIcon = findViewById<ImageView>(R.id.cam_icon_2) // Top-left camera icon
        val vidIcon = findViewById<ImageView>(R.id.vid_icon)
        val arrIcon = findViewById<ImageView>(R.id.arrow_icon)


        // New story icons (friends' stories)
        val storyIcon2 = findViewById<CircleImageView>(R.id.view_circle_2)
        val storyIcon3 = findViewById<CircleImageView>(R.id.view_circle_3)
        val storyIcon4 = findViewById<CircleImageView>(R.id.view_circle_4)

        // Navigate to Sixth_Activity on search icon click
        searchIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Sixth_Activity::class.java)
            startActivity(intent)
        }

        // Navigate to Fifteen_Activity on plus icon click
        plusIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Fifteen_Activity::class.java)
            startActivity(intent)
        }

        // Navigate to Twenty_two_Activity on heart icon click
        heartIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Twenty_two_Activity::class.java)
            startActivity(intent)
        }

        // Navigate to Eleventh_Activity on profile icon click
        profileIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Eleventh_Activity::class.java)
            startActivity(intent)
        }

        // Navigate to Fourteen_Activity on "Your Story" profile picture click
        yourStoryIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Fourteen_Activity::class.java)
            startActivity(intent)
        }

        // Navigate to Fifteen_Activity on top-left camera icon click
        camIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Fifteen_Activity::class.java)
            startActivity(intent)
        }


        vidIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Fifteen_Activity::class.java)
            startActivity(intent)
        }


        arrIcon.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Eight_Activity::class.java)
            startActivity(intent)
        }


        // Navigate to Sixteen_Activity on remaining three story icons
        storyIcon2.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Sixteen_Activity::class.java)
            startActivity(intent)
        }

        storyIcon3.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Sixteen_Activity::class.java)
            startActivity(intent)
        }

        storyIcon4.setOnClickListener {
            val intent = Intent(this@Fifth_Activity, Sixteen_Activity::class.java)
            startActivity(intent)
        }
    }
}
