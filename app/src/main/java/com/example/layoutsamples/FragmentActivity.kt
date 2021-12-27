package com.example.layoutsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutsamples.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    private lateinit var fr2: BlankFragment2
    private lateinit var fr: BlankFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fr2 = BlankFragment2.newInstance("","")
        fr = BlankFragment.newInstance("","")
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.switchButton.setOnClickListener {
            val t = supportFragmentManager.beginTransaction()
            if (fr2.isVisible)
                    t.replace(binding.fragmentContainerView.id,fr)
            else
                t.replace(binding.fragmentContainerView.id,fr2)
            t.commit()
        }
    }
}