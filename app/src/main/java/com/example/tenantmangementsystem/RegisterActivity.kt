package com.example.tenantmangementsystem

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmangementsystem.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val email = binding.registerEmailEditText.text.toString().trim()
            val password = binding.registerPasswordEditText.text.toString().trim()

            if (email.isEmpty()) {
                binding.registerEmailEditText.error = "Email is required"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.registerPasswordEditText.error = "Password is required"
                return@setOnClickListener
            }

            val intent = Intent(this, LoginActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                putExtra("EMAIL", email)
            }
            startActivity(intent)
            finish()
        }

        binding.loginLinkTextView.setOnClickListener {
            finish()
        }
    }
}
