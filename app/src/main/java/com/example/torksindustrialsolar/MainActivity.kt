package com.example.torksindustrialsolar

import android.animation.ObjectAnimator
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.viewpager.widget.ViewPager
import com.example.torksindustrialsolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var progressBar: ProgressBar
    private lateinit var progressBar1: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.statusBarColor = Color.WHITE

        progress1()
        progress2()

    }

    private fun progress1(){
        progressBar = binding.progress1
        progressBar.max = 100
        val currentProgress = 90
        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
            .setDuration(2000)
            .start()
    }

    private fun progress2(){
        progressBar1 = binding.progress2
        progressBar.max = 100
        val currentProgress = 95
        ObjectAnimator.ofInt(progressBar1, "progress", currentProgress)
            .setDuration(2000)
            .start()
    }
}