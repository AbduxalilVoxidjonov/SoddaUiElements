package com.example.soddauielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soddauielements.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private val binding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SignUp2::class.java)
            startActivity(intent)
        }
        binding.back.setOnClickListener{
            finish()
        }
    }
}