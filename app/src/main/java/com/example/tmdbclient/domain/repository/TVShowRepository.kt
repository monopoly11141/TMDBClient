package com.example.tmdbclient.domain.repository

import com.example.tmdbclient.data.model.tvshow.TVShow

interface TVShowRepository {

    suspend fun getTVShow() : List<TVShow>?

    suspend fun updateTVShow() : List<TVShow>?
}