package com.example.tmdbclient.data.repository

import com.example.tmdbclient.data.api.TMDBService
import com.example.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(private val tmdbService: TMDBService, private val apiKey: String) :
    MovieRemoteDatasource {


    override suspend fun getMovies(): Response<MovieList> =
        tmdbService.getNowPlayingMovies(apiKey)

}