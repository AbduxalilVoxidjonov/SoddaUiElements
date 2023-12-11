package com.example.soddauielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soddauielements.databinding.ActivitySignUp2Binding

class SignUp2 : AppCompatActivity() {
    private val binding by lazy { ActivitySignUp2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.next.setOnClickListener {
            val intent = Intent(this, SignUp3::class.java)
            startActivity(intent)
        }
        binding.back.setOnClickListener {
            finish()
        }
    }
}