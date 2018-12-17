package com.cesarvaliente.hipster.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cesarvaliente.hipster.R
import kotlinx.android.synthetic.main.nav_2_0_layout.*

class Nav_2_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.nav_2_0_layout, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindViews()
    }

    private fun bindViews() {
        to_navigation_2_1.setOnClickListener { Navigation.createNavigateOnClickListener(R.id.nav_2_1_Fragment) }
    }
}