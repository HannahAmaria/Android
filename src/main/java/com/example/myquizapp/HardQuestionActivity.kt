package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityHardQuestionBinding
import com.example.myquizapp.models.HardQuestion
import com.example.myquizapp.models.Hard_Constants.allQuestions
import com.example.myquizapp.models.Hard_Constants.getAllQuestions

class HardQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityHardQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHardQuestionBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        setContentView(view)

        val username = intent.getStringExtra("username")

        val questionNumber = intent.getIntExtra("questionNumber", 1)

        var userScore = intent.getIntExtra("userscore", 0);

        if (questionNumber == 1){
            getAllQuestions()
        }

        if (username != null) {
            Log.d("AAA username: ", username)
        }

        val listOfQuestions :ArrayList<HardQuestion> = allQuestions

        val currentQuestion = listOfQuestions[questionNumber!!-1]

        Log.d("AAA USER SCORE:", userScore.toString())
        Log.d("AAA total Questions:", listOfQuestions.count().toString())
        Log.d("AAA First Question: ", currentQuestion.questionText)

        binding.question3.text = currentQuestion.questionText
        binding.optionOne3.text = currentQuestion.optionOne
        binding.optionTwo3.text = currentQuestion.optionTwo
        binding.optionThree3.text = currentQuestion.optionThree
        binding.optionFour3.text = currentQuestion.optionFour
        binding.progress3.progress = currentQuestion.id
        binding.number3.text = "${currentQuestion.id}/${listOfQuestions.count()}"

        binding.btnNext2.setOnClickListener {
            var selectedAnswer: Int = binding.options.checkedRadioButtonId

            if(selectedAnswer != 1) {
                var selectedAnswerValue = findViewById<RadioButton>(selectedAnswer)

                if(selectedAnswerValue.text == currentQuestion.correctAnswer) {
                    userScore = userScore!! + 1
                }

                if(questionNumber == listOfQuestions.count()) {
                    if (userScore == 6){

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, ResultActivity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString())

                        startActivity(intent)
                        finish()

                    } else if (userScore == 4) {

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result2Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString())

                        startActivity(intent)
                        finish()

                    } else if (userScore == 5){
                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result2Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString())

                        startActivity(intent)
                        finish()
                    } else {

                        Log.d("AAA RESULT:", userScore.toString())
                        val intent =Intent(this, Result3Activity::class.java)
                        intent.putExtra("userscore", userScore)
                        intent.putExtra("totalQuestions", listOfQuestions.count())

                        intent.putExtra("username", username.toString())

                        startActivity(intent)
                        finish()
                    }

                }else {
                    val intent = Intent(this, HardQuestionActivity::class.java)
                    if (questionNumber != null){
                        intent.putExtra("questionNumber", questionNumber+1)
                    }
                    intent.putExtra("userscore", userScore)

                    intent.putExtra("username", username.toString())

                    startActivity(intent)
                    finish()
                }

            }else {
                Toast.makeText(this, "Please select your answer", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnback.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
        }






    }
}