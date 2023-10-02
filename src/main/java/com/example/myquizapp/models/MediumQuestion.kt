package com.example.myquizapp.models

data class MediumQuestion(
    val id: Int,
    val questionText: String,
    // all images should be int
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String?,
    val correctAnswer: String
)
