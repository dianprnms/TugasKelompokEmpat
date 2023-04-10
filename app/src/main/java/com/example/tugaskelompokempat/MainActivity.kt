package com.example.tugaskelompokempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaskelompokempat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}