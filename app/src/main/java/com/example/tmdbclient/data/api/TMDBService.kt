package com.example.tmdbclient.data.api

import com.example.tmdbclient.data.model.artist.ArtistList
import com.example.tmdbclient.data.model.movie.MovieList
import com.example.tmdbclient.data.model.tvshow.TVShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("/movies/get-now-playing")
    suspend fun getNowPlayingMovies(@Query("api_key") apiKey : String) : Response<MovieList>

    @GET("/tv/popular")
    suspend fun getPopularTVShows(@Query("api_key") apiKey : String) : Response<TVShowList>

    @GET("/person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey : String) : Response<ArtistList>
}