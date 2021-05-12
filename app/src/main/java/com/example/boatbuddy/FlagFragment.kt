package com.example.boatbuddy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_flag.*

class FlagFragment : Fragment() {

    private lateinit var flagAdapter: FlagAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_flag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.nav_view?.menu?.getItem(1)?.isChecked = true
        activity?.title="Flags"
        flag_recycler_view.apply {
            layoutManager = LinearLayoutManager(this.context)
            flagAdapter = FlagAdapter()
            adapter = flagAdapter
        }
        val data = FlagDataSource.createDataSet()
        flagAdapter.submitFlagList(data)
        return
    }
}