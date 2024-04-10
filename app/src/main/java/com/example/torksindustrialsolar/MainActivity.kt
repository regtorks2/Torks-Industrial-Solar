package com.example.torksindustrialsolar

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
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


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu, menu)
        return super.onCreateOptionsMenu(menu)
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

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.our_company -> {
                 val intent = Intent(this, OurCompany::class.java)
                startActivity(intent)
                true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }


    }

}