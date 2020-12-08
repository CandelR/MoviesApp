package com.ramon.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramon.moviesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.message.text = "Hello Android"

    }
}