package com.cesarvaliente.hipster.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cesarvaliente.hipster.R
import kotlinx.android.synthetic.main.nav_1_layout.*

class Nav_1_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.nav_1_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews()
    }

    private fun bindViews() {
        to_navigation_2_0.setOnClickListener { Navigation.findNavController(it).navigate(R.id.nav_2_0_Fragment) }
        to_navigation_3_0.setOnClickListener { Navigation.findNavController(it).navigate(R.id.nav_3_0_Fragment) }
    }
}