package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sixth_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sixth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Search input (from top search bar)
        val searchInput = findViewById<TextInputEditText>(R.id.search_input)

        // Search icon in bottom nav
        val searchIcon = findViewById<ImageView>(R.id.search_icon_1)

        searchIcon.setOnClickListener {
            val query = searchInput?.text?.toString()?.trim()

            if (!query.isNullOrEmpty()) {
                val intent = Intent(this, Seventh_Activity::class.java)
                intent.putExtra("SEARCH_QUERY", query) // pass query if needed
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter something to search", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
