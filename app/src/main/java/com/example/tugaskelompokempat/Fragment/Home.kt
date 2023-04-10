package com.example.tugaskelompokempat.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugaskelompokempat.Adapter.FilmAdapter
import com.example.tugaskelompokempat.Data.ListFilm
import com.example.tugaskelompokempat.ViewModel.FilmViewModel
import com.example.tugaskelompokempat.databinding.FragmentHomeBinding


class Home : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var filmVm: FilmViewModel
    lateinit var filmAdapter: FilmAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmAdapter = FilmAdapter(ArrayList())

        filmVm.getFilmList()
        filmVm.filmList.observe(viewLifecycleOwner, Observer {
            filmAdapter.getFilmData(it as ArrayList<ListFilm>)
        })
        binding.rvHome.layoutManager = GridLayoutManager(context, 2)
        binding.rvHome.adapter = filmAdapter
    }


}