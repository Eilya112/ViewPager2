package com.example.atestkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.atestkotlin.databinding.Fragment1Binding


class Fragment3 : Fragment() {

    lateinit var binding: Fragment1Binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= Fragment1Binding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtFragment.text="Fragment 3"
        binding.framelayout.background = ContextCompat.getDrawable(binding.root.context,R.color.colorAccent)

    }


}