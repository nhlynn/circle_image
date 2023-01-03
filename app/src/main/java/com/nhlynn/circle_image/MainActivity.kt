package com.nhlynn.circle_image

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.nhlynn.circle_image.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivNhlynn.setHighlightColor(Color.parseColor("#806200EE"))
        binding.ivNhlynn.setHighlightEnable(true) // true or false
        binding.ivNhlynn.setStrokeColor(ContextCompat.getColor(this,R.color.purple_500))
        binding.ivNhlynn.setStrokeWidth(2f)
    }
}