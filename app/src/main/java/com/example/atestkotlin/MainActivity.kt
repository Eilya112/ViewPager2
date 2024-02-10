package com.example.atestkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.atestkotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var myAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myAdapter = MyViewPagerAdapter(this)
        binding.viewpager.adapter = myAdapter
        binding.viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewpager.offscreenPageLimit = 3

        val mediator = TabLayoutMediator(
            binding.tablayout,
            binding.viewpager
        ) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Image"
                    tab.icon= ContextCompat.getDrawable(this,R.drawable.ic_image)
                }

                1 -> {
                    tab.text = "Music"
                    tab.icon= ContextCompat.getDrawable(this,R.drawable.ic_music)
                }

                2 -> {
                    tab.text = "Video"
                    tab.icon= ContextCompat.getDrawable(this,R.drawable.ic_video)
                }
            }
        }
        mediator.attach()

    }
}