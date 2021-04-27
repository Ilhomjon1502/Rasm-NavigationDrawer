package com.ilhomjon.homework50rasmnavigationdrawer.ui.random

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ilhomjon.homework50rasmnavigationdrawer.R

class RandomFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
       val root = inflater.inflate(R.layout.fragment_random, container, false)

        return root
    }
}