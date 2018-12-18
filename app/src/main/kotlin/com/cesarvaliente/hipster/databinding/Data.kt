package com.cesarvaliente.hipster.databinding

data class User(
    val name: String,
    val surname: String,
    val age: Int
)

data class City(
    val name: String,
    val country: String
)

data class VideoGame(
    val name: String,
    val company: String?,
    val publisher: String?,
    val year: Int
)