package com.example.layoutsamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutsamples.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toConstraint.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.toCoordinator.setOnClickListener {
            startActivity(Intent(this, CoordinatorActivity::class.java))
        }
        binding.toFragments.setOnClickListener {
            startActivity(Intent(this,FragmentActivity::class.java))
        }
    }
}