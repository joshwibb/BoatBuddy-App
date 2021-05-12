package com.example.boatbuddy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {

    private lateinit var mapButton: Button
    private lateinit var lightsButton: Button
    private lateinit var soundsButton: Button
    private lateinit var shapesButton: Button
    private lateinit var buoysButton: Button
    private lateinit var flagsButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        activity?.nav_view?.menu?.getItem(0)?.isChecked = true
        activity?.title = "Home"
        mapButton = view.findViewById(R.id.map_button)
        lightsButton = view.findViewById(R.id.lights_button)
        soundsButton = view.findViewById(R.id.sounds_button)
        shapesButton = view.findViewById(R.id.shapes_button)
        buoysButton = view.findViewById(R.id.buoys_button)
        flagsButton = view.findViewById(R.id.flags_button)

        mapButton.setOnClickListener{
            findNavController().navigate(R.id.mapsFragment)
        }
        lightsButton.setOnClickListener{
            findNavController().navigate(R.id.lightsFragment)
        }
        soundsButton.setOnClickListener{
            findNavController().navigate(R.id.soundsFragment)
        }
        shapesButton.setOnClickListener{
            findNavController().navigate(R.id.shapesFragment)
        }
        buoysButton.setOnClickListener{
            findNavController().navigate(R.id.buoysFragment)
        }
        flagsButton.setOnClickListener{
            findNavController().navigate(R.id.flagFragment)
        }

        return view
    }

}