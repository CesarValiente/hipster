package com.cesarvaliente.hipster.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.cesarvaliente.hipster.R

class DataBindingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: DataBindingLayoutBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.data_binding_layout, container, false
        )
        binding.user = User(name = "Cesar", surname = "Valiente Gordo", age = 38)
        return binding.root
    }

}