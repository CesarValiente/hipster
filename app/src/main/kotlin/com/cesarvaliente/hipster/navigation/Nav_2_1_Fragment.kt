package com.cesarvaliente.hipster.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.cesarvaliente.hipster.R
import kotlinx.android.synthetic.main.nav_2_1_layout.*

class Nav_2_1_Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.nav_2_1_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews()
    }

    private fun bindViews() {
        to_navigation_shared.setOnClickListener { Navigation.findNavController(it).navigate(R.id.navSharedFragment) }
    }
}