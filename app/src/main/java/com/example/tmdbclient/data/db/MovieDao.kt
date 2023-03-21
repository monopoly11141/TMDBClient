package com.example.tmdbclient.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclient.data.model.movie.Movie
import retrofit2.http.GET

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movies : List<Movie>)

    @Query("DELETE FROM recent_movies")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM recent_movies")
    suspend fun getMovies() : List<Movie>
}