package com.example.myquizapp.models

object Medium_Constants {

    var allQuestions = ArrayList<MediumQuestion>()

    fun getAllQuestions() {

        val que1 = MediumQuestion(
            id = 1,
            questionText = "Which song marked The Weeknd's mainstream breakthrough and topped the Billboard Hot 100 in 2015?",
            optionOne = "The Hills",
            optionTwo = "In the Night",
            optionThree = "Often",
            correctAnswer = "The Hills"
        )

        val que2 = MediumQuestion(
            id = 2,
            questionText = "The Weeknd contributed the song Earned It to the soundtrack of which film?",
            optionOne = "Twilight",
            optionTwo = "Fifty Shades of Grey",
            optionThree = "The Great Gatsby",
            correctAnswer = "Fifty Shades of Grey"
        )

        val que3 = MediumQuestion(
            id = 3,
            questionText = "What is the name of The Weeknd's own record label?",
            optionOne = "XO Records",
            optionTwo = "Starboy Music",
            optionThree = "After Hours Records",
            correctAnswer = "XO Records"
        )

        val que4 = MediumQuestion(
            id = 4,
            questionText = "Which of The Weeknd's songs won the Grammy Award for Record of the Year in 2021?",
            optionOne = "Blinding Lights",
            optionTwo = "Heartless",
            optionThree = "Save Your Tears",
            correctAnswer = "Blinding Lights"
        )

        val que5 = MediumQuestion(
            id = 5,
            questionText = "What was the title of The Weeknd's 2020 album that included hits like Blinding Lights?",
            optionOne = "After Hours",
            optionTwo = "Starboy",
            optionThree = "Kiss Land",
            correctAnswer = "After Hours"
        )

        val que6 = MediumQuestion(
            id = 6,
            questionText = "In which year did The Weeknd perform at the Coachella Valley Music and Arts Festival?",
            optionOne = "2016",
            optionTwo = "2017",
            optionThree = "2018",
            correctAnswer = "2019"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }
}