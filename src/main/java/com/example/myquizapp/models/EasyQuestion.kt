package com.example.myquizapp.models

data class EasyQuestion(
    val id: Int,
    val questionText: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String?,
    val correctAnswer: String
)
