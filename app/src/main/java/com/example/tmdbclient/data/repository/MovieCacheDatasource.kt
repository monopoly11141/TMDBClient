package com.example.tmdbclient.data.repository

import com.example.tmdbclient.data.model.movie.Movie

interface MovieCacheDatasource {

    suspend fun getMovieFromCache() : List<Movie>

    suspend fun saveMovieToCache(movies : List<Movie>)
}