package com.example.tugaskelompokempat.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugaskelompokempat.ListFilm
import com.example.tugaskelompokempat.R
import com.example.tugaskelompokempat.databinding.FragmentFilmDetailBinding

@Suppress("DEPRECATION")
class FilmDetail : Fragment() {
    lateinit var binding : FragmentFilmDetailBinding
    companion object{
        val DATA_FILM = "data_film"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFilmDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataFilm = arguments?.getParcelable<ListFilm>(DATA_FILM)
        binding.filmData = dataFilm
    }
}