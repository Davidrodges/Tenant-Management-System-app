package com.example.tenantmangementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val email = "student@strathmore.edu"
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("EMAIL", email)
        startActivity(intent)
        finish()
    }
}
