package com.example.boatbuddy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_lights.*

class LightsFragment : Fragment() {

    private lateinit var lightsAdapter: LightsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_lights, container, false)
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.nav_view?.menu?.getItem(3)?.isChecked = true
        activity?.title="Lights"
        lights_recycler_view.apply {
            layoutManager = GridLayoutManager(this.context, 2, LinearLayoutManager.HORIZONTAL, false)
            lightsAdapter = LightsAdapter()
            adapter = lightsAdapter
        }
        val data = LightsDataSource.createDataSet()
        lightsAdapter.submitLightsList(data)
        return
    }
    
}