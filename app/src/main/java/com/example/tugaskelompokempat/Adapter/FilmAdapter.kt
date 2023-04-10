package com.example.tugaskelompokempat.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaskelompokempat.Fragment.FilmDetail
import com.example.tugaskelompokempat.ListFilm
import com.example.tugaskelompokempat.R
import com.example.tugaskelompokempat.databinding.ItemFilmBinding

class FilmAdapter(var listFilm: ArrayList<ListFilm>): RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder (val binding: ItemFilmBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item : ListFilm, holder: ViewHolder){
            binding.filmData = item
            binding.cardFilm.setOnClickListener {
                val bundle = Bundle()
                bundle.putParcelable(FilmDetail.DATA_FILM, item)
                holder.itemView.findNavController().navigate(R.id.action_home2_to_filmDetail, bundle)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemFilmBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(listFilm[position], holder)

    fun getFilmData(listFilm: ArrayList<ListFilm>){
        this.listFilm = listFilm
    }
}