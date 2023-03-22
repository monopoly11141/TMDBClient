package com.example.tmdbclient.domain.usecase

import com.example.tmdbclient.data.model.tvshow.TVShow
import com.example.tmdbclient.domain.repository.TVShowRepository

class UpdateTVShowsUseCase(private val tvShowRepository: TVShowRepository) {

    suspend fun execute() : List<TVShow>? = tvShowRepository.updateTVShow()
}