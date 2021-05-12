package com.example.boatbuddy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class BuoysFragment : Fragment() {

    private lateinit var latbutton: ImageButton
    private lateinit var cardinalbutton: ImageButton
    private lateinit var specialbutton: ImageButton
    private lateinit var isolateddangerbutton: ImageButton
    private lateinit var emergencywreckbutton: ImageButton
    private lateinit var preferredchannelbutton: ImageButton
    private lateinit var safewaterbutton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buoys, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.nav_view?.menu?.getItem(6)?.isChecked = true
        activity?.title="Buoys"

        latbutton = view.findViewById<ImageButton>(R.id.lateralbutton)
        cardinalbutton = view.findViewById<ImageButton>(R.id.cardinalbutton)
        specialbutton = view.findViewById<ImageButton>(R.id.specialbutton)
        isolateddangerbutton = view.findViewById<ImageButton>(R.id.isolatedbutton)
        emergencywreckbutton = view.findViewById<ImageButton>(R.id.emergencywreckbutton)
        preferredchannelbutton = view.findViewById<ImageButton>(R.id.preferredchannelbutton)
        safewaterbutton = view.findViewById<ImageButton>(R.id.safewaterbutton)

        latbutton.setOnClickListener{
            findNavController().navigate(R.id.latMarkFragment)
        }
        cardinalbutton.setOnClickListener{
            findNavController().navigate(R.id.cardinalFragment)
        }
        specialbutton.setOnClickListener{
            findNavController().navigate(R.id.specialMarkFragment)
        }
        isolateddangerbutton.setOnClickListener{
            findNavController().navigate(R.id.isolatedDangerFragment)
        }
        emergencywreckbutton.setOnClickListener{
            findNavController().navigate(R.id.emergencyWreckFragment)
        }
        preferredchannelbutton.setOnClickListener{
            findNavController().navigate(R.id.preferredChannelFragment)
        }
        safewaterbutton.setOnClickListener{
            findNavController().navigate(R.id.safeWaterFragment)
        }
        return
    }
}