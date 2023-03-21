package com.example.tmdbclient.data.model.tvshow


import com.google.gson.annotations.SerializedName

data class TVShowList(
    @SerializedName("results")
    val artists: List<TVShow>
)