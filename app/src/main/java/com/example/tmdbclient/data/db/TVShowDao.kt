package com.example.tmdbclient.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbclient.data.model.tvshow.TVShow

@Dao
interface TVShowDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTVShow(tvShows : List<TVShow>)

    @Query("DELETE FROM popular_TV_Shows")
    suspend fun deleteAllTVShows()

    @Query("SELECT * FROM popular_TV_Shows")
    suspend fun getTVShows() : List<TVShow>

}