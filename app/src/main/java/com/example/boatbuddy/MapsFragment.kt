package com.example.boatbuddy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.synthetic.main.activity_main.*

class MapsFragment : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->
        val uk = LatLng(53.80080345524019, -1.5529045036991764)
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(5.5F))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(uk))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        activity?.nav_view?.menu?.getItem(5)?.isChecked = true
        activity?.title = "Map"
    }
}