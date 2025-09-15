package com.example.smdproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class Fourth_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Finding views
        val backArrow = findViewById<ImageView>(R.id.middle_leftArrowSection)
        val loginBtn = findViewById<MaterialButton>(R.id.btn_login)
        val signUpText = findViewById<TextView>(R.id.signUp_navigate)
        val usernameInput = findViewById<TextInputEditText>(R.id.username_input)
        val passwordInput = findViewById<TextInputEditText>(R.id.password_input)


        // Back arrow  (Third_Activity)
        backArrow.setOnClickListener {
            val intent = Intent(this, Third_Activity::class.java)
            startActivity(intent)
            finish()
        }

        // Login button Fifth_Activity (only if both fields are filled)
        loginBtn.setOnClickListener {
            val username = usernameInput?.text.toString().trim()
            val password = passwordInput?.text.toString().trim()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                val intent = Intent(this, Fourth_Activity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
            }
        }

        // SignUp text → Second_Activity
        signUpText.setOnClickListener {
            val intent = Intent(this, Second_activity::class.java)
            startActivity(intent)
        }
    }
}
