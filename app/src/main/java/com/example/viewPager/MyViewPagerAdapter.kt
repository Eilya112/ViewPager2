package com.example.viewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewPager.fragments.Fragment1
import com.example.viewPager.fragments.Fragment2
import com.example.viewPager.fragments.Fragment3

class MyViewPagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment1()
            }

            1 -> {
                Fragment2()
            }

            2 -> {
                Fragment3()
            }

            else -> {
                Fragment()
            }
        }
    }
}