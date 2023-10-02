package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.Toast
import com.example.myquizapp.databinding.ActivityMediumQuestionBinding
import com.example.myquizapp.models.MediumQuestion
import com.example.myquizapp.models.Medium_Constants.allQuestions
import com.example.myquizapp.models.Medium_Constants.getAllQuestions



class MediumQuestionActivity : AppCompatActivity() {

    lateinit var binding: ActivityMediumQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMediumQuestionBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        setContentView(view)

        val username = intent.getStringExtra("username")

        val questionNumber = intent.getIntExtra("questionNumber", 1)

        var userScore = intent.getIntExtra("userscore", 0);

        if (questionNumber == 1){
            getAllQuestions()
        }

        val listOfQuestions :ArrayList<MediumQuestion> = allQuestions

        val currentQuestion = listOfQuestions[questionNumber!!-1]

        Log.d("AAA USER SCORE:", userScore.toString())
        Log.d("AAA total Questions:", listOfQuestions.count().toString())
        Log.d("AAA First Question: ", currentQuestion.questionText)

        binding.question2.text = currentQuestion.questionText
        binding.optionOne2.text = currentQuestion.optionOne
        binding.optionTwo2.text = currentQuestion.optionTwo
        binding.optionThree2.text = currentQuestion.optionThree
        binding.progress2.progress = currentQuestion.id
        binding.number2.text = "${currentQuestion.id}/${listOfQuestions.count()}"

        binding.btnNext3.setOnClickListener{
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
                    val intent = Intent(this, MediumQuestionActivity::class.java)
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

        binding.btnBack.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            startActivity(intent)
        }


    }
}