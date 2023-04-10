package com.example.tugaskelompokempat.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaskelompokempat.Data.ListFilm
import com.example.tugaskelompokempat.databinding.ItemFilmBinding

class FilmAdapter(var listFilm: ArrayList<ListFilm>): RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder (val binding: ItemFilmBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item : ListFilm){
            binding.nama.text = item.nama
            binding.img.setImageResource(item.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(listFilm[position])

    fun getFilmData(listFilm: ArrayList<ListFilm>){
        this.listFilm = listFilm
    }
}