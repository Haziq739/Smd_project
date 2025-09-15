package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Views
        val backArrow = findViewById<ImageView>(R.id.middle_arrowSection)
        val createBtn = findViewById<Button>(R.id.btn_create)

        val username = findViewById<EditText>(R.id.username)
        val firstName = findViewById<EditText>(R.id.Firstname)
        val lastName = findViewById<EditText>(R.id.Lastname)
        val dob = findViewById<EditText>(R.id.D_Of_B)
        val email = findViewById<EditText>(R.id.mail)
        val password = findViewById<EditText>(R.id.pass)

        // Back to Third_Activity
        backArrow.setOnClickListener {
            val intent = Intent(this, Third_Activity::class.java)
            startActivity(intent)
            finish()
        }

        // Create Account and move to  Fifth_Activity only if fields are filled
        createBtn.setOnClickListener {
            val u = username.text.toString().trim()
            val f = firstName.text.toString().trim()
            val l = lastName.text.toString().trim()
            val d = dob.text.toString().trim()
            val e = email.text.toString().trim()
            val p = password.text.toString().trim()

            if (u.isNotEmpty() && f.isNotEmpty() && l.isNotEmpty() &&
                d.isNotEmpty() && e.isNotEmpty() && p.isNotEmpty()
            ) {
                val intent = Intent(this, Fifth_Activity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
