package com.example.umc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.umc1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var state = true // pic1
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setPICClickEvent()
    }

    private fun setPICClickEvent() {
        binding.btnChangePic.setOnClickListener {
            if (state == true) {
                state = false
            }
            else {
                state = true
                binding.pic2.visibility
            }
        }
    }
}