package com.example.boatbuddy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*


class SafeWaterFragment : Fragment() {

    private lateinit var backButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_safe_water, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        backButton = view.findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener{
            findNavController().navigate(R.id.action_safeWaterFragment_to_buoysFragment)
        }

        activity?.nav_view?.menu?.getItem(6)?.isChecked = true
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
    }

}