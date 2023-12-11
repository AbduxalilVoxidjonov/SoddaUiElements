package com.example.soddauielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soddauielements.databinding.ActivitySignUp3Binding

class SignUp3 : AppCompatActivity() {
    private val binding by lazy{ ActivitySignUp3Binding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUp4::class.java)
            startActivity(intent)
        }
        binding.back.setOnClickListener{
            finish()
        }
    }
}