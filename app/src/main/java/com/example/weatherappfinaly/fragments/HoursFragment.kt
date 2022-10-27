package com.example.weatherappfinaly.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherappfinaly.R
import com.example.weatherappfinaly.adapters.WeatherAdapter
import com.example.weatherappfinaly.adapters.WeatherModel
import com.example.weatherappfinaly.databinding.HoursBinding


class HoursFragment : Fragment() {
    private lateinit var binding: HoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = HoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "","12:00",
                "Sunny","-85ºC",
                "", "", "",""),
            WeatherModel(
                "","13:00",
                "Sunny","-75ºC",
                "", "", "",""),
            WeatherModel(
                "","14:00",
                "Sunny","-5ºC",
                "", "", "","")
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}