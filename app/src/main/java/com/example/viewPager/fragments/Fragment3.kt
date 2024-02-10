package com.example.viewPager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.atestkotlin.databinding.Fragment3Binding


class Fragment3 : Fragment() {

    lateinit var binding: Fragment3Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= Fragment3Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtFragment.text="Fragment 3"
//        binding.framelayout.background = ContextCompat.getDrawable(binding.root.context,
//            R.color.colorAccent
//        )

    }


}