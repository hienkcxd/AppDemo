package com.example.appds_v2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appds_v2.R
import com.example.appds_v2.databinding.ActivityDashBoardBinding
import com.example.appds_v2.databinding.ActivityMainBinding

class DashBoardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}