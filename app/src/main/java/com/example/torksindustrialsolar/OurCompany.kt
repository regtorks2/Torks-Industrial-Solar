package com.example.torksindustrialsolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.torksindustrialsolar.databinding.ActivityMainBinding
import com.example.torksindustrialsolar.databinding.OurCompanyBinding

class OurCompany: AppCompatActivity() {
    private lateinit var binding: OurCompanyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OurCompanyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
  }


}