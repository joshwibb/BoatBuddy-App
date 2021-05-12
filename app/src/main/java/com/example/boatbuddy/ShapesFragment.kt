package com.example.boatbuddy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_shapes.*

class ShapesFragment : Fragment() {

    private lateinit var shapesAdapter: ShapesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shapes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.nav_view?.menu?.getItem(4)?.isChecked = true
        activity?.title="Day Shapes"
        shapes_recycler_view.apply {
            layoutManager = GridLayoutManager(this.context, 2, LinearLayoutManager.HORIZONTAL, false)
            shapesAdapter = ShapesAdapter()
            adapter = shapesAdapter
        }
        val data = ShapesDataSource.createDataSet()
        shapesAdapter.submitShapesList(data)
        return
    }

}