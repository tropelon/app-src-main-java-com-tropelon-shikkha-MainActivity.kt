package com.tropelon.shikkha.model

data class Banner(val imageUrl: String = "", val title: String = "")

data class Course(
    val title: String = "",
    val imageUrl: String = "",
    val description: String = "",
    val price: String = ""
)
