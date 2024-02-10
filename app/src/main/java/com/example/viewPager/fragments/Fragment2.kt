package com.example.viewPager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.atestkotlin.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    lateinit var binding: Fragment2Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtFragment.text = "Fragment 2"
//        binding.framelayout.background = ContextCompat.getDrawable(
//            binding.root.context,
//            R.color.gray400
//        )

    }


}