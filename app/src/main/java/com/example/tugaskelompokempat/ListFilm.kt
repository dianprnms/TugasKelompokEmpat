package com.example.tugaskelompokempat

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class ListFilm(val img : Int, val nama : String, val release: String, val rating: String, val sinopsis: String): Parcelable
