package com.example.myquizapp.models

object Hard_Constants {

    var allQuestions = ArrayList<HardQuestion>()

    fun getAllQuestions() {

        val que1 = HardQuestion(
            id = 1,
            questionText = "Which unreleased album was promoted by The Weeknd's 2018 EP My Dear Melancholy?",
            optionOne = "Chapter IV",
            optionTwo = "Trilogy II",
            optionThree = "Kiss Land 2",
            optionFour = "Chapter VI",
            correctAnswer = "Chapter VI"
        )

        val que2 = HardQuestion(
            id = 2,
            questionText = "The Weeknd co-wrote the song Love Me Harder with which fellow pop star?",
            optionOne = "Ariana Grande",
            optionTwo = "Rihanna",
            optionThree = "Beyonce",
            optionFour = "Taylor Swift",
            correctAnswer = "Ariana Grande"
        )

        val que3 = HardQuestion(
            id = 3,
            questionText = "What is the title of The Weeknd's 2021 compilation album that included tracks from his early mixtapes?",
            optionOne = "Before Dawn",
            optionTwo = "Retrograde",
            optionThree = "The Highlights",
            optionFour = "Legacy",
            correctAnswer = "The Highlights"
        )

        val que4 = HardQuestion(
            id = 4,
            questionText = "Which music festival did The Weeknd headline in 2018 becoming the first Canadian to do so?",
            optionOne = "Glastonbury Festival",
            optionTwo = "Lollapalooza",
            optionThree = "Bonnaroo Music and Arts Festival",
            optionFour = " Coachella Valley Music and Arts Festival",
            correctAnswer = "Bonnaroo Music and Arts Festival"
        )

        val que5 = HardQuestion(
            id = 5,
            questionText = "What is the name of The Weeknd's alter ego which he introduced during his After Hours era?",
            optionOne = "Starboy",
            optionTwo = "The Character",
            optionThree = "Melancholy Man",
            optionFour = "Kenny G",
            correctAnswer = "The Character"
        )

        val que6 = HardQuestion(
            id = 6,
            questionText = "Which song from The Weeknd's Starboy album features the French electronic duo Daft Punk?",
            optionOne = "Reminder",
            optionTwo = "I Feel It Coming",
            optionThree = "Sidewalks",
            optionFour = "A Lonely Night",
            correctAnswer = "I Feel It Coming"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)
        allQuestions.add(que6)

    }
}