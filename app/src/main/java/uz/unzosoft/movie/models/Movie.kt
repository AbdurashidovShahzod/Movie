package uz.unzosoft.movie.models

import java.io.Serializable

data class Movie(
    val nameMovie: String,
    val authorsMovie: String,
    val aboutMovie: String,
    val dataMovie: String
) : Serializable