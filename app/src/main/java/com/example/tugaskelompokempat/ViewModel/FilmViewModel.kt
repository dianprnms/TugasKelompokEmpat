package com.example.tugaskelompokempat.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tugaskelompokempat.ListFilm
import com.example.tugaskelompokempat.R
import com.thedeanda.lorem.LoremIpsum

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        ListFilm(R.drawable.su, "Start Up", "24/02/2020", "4.1", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.hmt, "Hometown Cha-Cha", "21/10/2019", "4.2", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.gd, "Ghost Doctor", "19/12/2017", "3.9", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.ic, "Itaewon Class", "21/02/2020", "4.5", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.bp, "Business Proposal", "04/01/2021", "4.6", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.mn, "My Name", "15/11/2015", "3.8", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.v, "Vincenzo", "21/07/2022", "3.6", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.pu, "Police University", "15/08/2021", "3.5", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.td, "Taxi Driver", "17/09/2022", "4.8", LoremIpsum.getInstance().getWords(50)),
        ListFilm(R.drawable.cl, "CLOY", "05/12/2021", "4.9", LoremIpsum.getInstance().getWords(50))

    )
    val filmList : MutableLiveData<List<ListFilm>> = MutableLiveData()

    fun getFilmList(){
        filmList.value = list
    }
}