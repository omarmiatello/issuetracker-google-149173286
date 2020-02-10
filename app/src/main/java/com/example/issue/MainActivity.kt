package com.example.issue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.issue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.included.myTextView.text = "test from activity"
    }
}