package com.example.myquizapp.models

object Easy_Constants {

    var allQuestions = ArrayList<EasyQuestion>()

    fun getAllQuestions() {

        val que1 = EasyQuestion(
            id = 1,
            questionText = "What is The Weeknd's real name?",
            optionOne = "Abel Tesfaye",
            optionTwo = "John Legend",
            optionThree = " Kanye West",
            optionFour = "Drake",
            correctAnswer = "Abel Tesfaye"
        )

        val que2 = EasyQuestion(
            id = 2,
            questionText = "In which Canadian city was The Weeknd born?",
            optionOne = "Toronto",
            optionTwo = "Montreal",
            optionThree = "Vancouver",
            optionFour = "Ottawa",
            correctAnswer = "Toronto"
        )

        val que3 = EasyQuestion(
            id = 3,
            questionText = "Which song by The Weeknd became a viral sensation on TikTok in 2020?",
            optionOne = "Blinding Lights",
            optionTwo = "Starboy",
            optionThree = "Can't Feel My Face",
            optionFour = "Earned It",
            correctAnswer = "Blinding Lights"
        )

        val que4 = EasyQuestion(
            id = 4,
            questionText = "What year did The Weeknd release his debut album Kiss Land?",
            optionOne = "2011",
            optionTwo = "2012",
            optionThree = "2013",
            optionFour = "2014",
            correctAnswer = "2013"
        )

        val que5 = EasyQuestion(
            id = 5,
            questionText = "Which album earned The Weeknd a Grammy Award for Best Urban Contemporary Album in 2016?",
            optionOne = "Trilogy",
            optionTwo = "Beauty Behind the Madness",
            optionThree = "Starboy",
            optionFour = "After Hours",
            correctAnswer = "Beauty Behind the Madness"
        )

        val que6 = EasyQuestion(
            id = 6,
            questionText = "What was the title of The Weeknd's halftime performance at the 2021 Super Bowl?",
            optionOne = "The Starboy Spectacle",
            optionTwo = "After Hours Extravaganza",
            optionThree = "The Weeknd's World",
            optionFour = "The Highlights Show",
            correctAnswer = "The Highlights Show"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }

}