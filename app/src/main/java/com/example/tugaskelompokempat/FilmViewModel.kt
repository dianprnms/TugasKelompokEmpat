package com.example.tugaskelompokempat

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        ListFilm(R.drawable.su, "Start Up"),
        ListFilm(R.drawable.hmt, "Hometown Cha-Cha"),
        ListFilm(R.drawable.gd, "Ghost Doctor"),
        ListFilm(R.drawable.ic, "Itaewon Class"),
        ListFilm(R.drawable.bp, "Business Proposal"),
        ListFilm(R.drawable.mn, "My Name"),
        ListFilm(R.drawable.v, "Vincenzo"),
        ListFilm(R.drawable.pu, "Police University"),
        ListFilm(R.drawable.td, "Taxi Driver"),
        ListFilm(R.drawable.cl, "CLOY")

    )
    val filmList : MutableLiveData<List<ListFilm>> = MutableLiveData()

    fun getFilmList(){
        var stu = list
        filmList.value = stu
    }
}