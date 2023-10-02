package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityResult2Binding
import com.example.myquizapp.databinding.ActivityResultBinding
import com.google.android.material.snackbar.Snackbar

class Result2Activity : AppCompatActivity() {

    lateinit var binding: ActivityResult2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResult2Binding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        setContentView(view)

        val totalQuestions = intent.extras?.getInt("totalQuestions", 0)


        var userScore = intent.extras?.getInt("userscore", 0);

        val username = intent.extras?.getString("username")

        binding.resultname2.text = "Nice one " + username.toString() + "!"

        binding.total2.text = userScore.toString() + "/" + totalQuestions.toString()

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)

        val editor = sharedPref.edit()

        editor.apply{
            putString("last_user", username)
            putInt("last_score", userScore!!)
            apply()
        }

        binding.score2.setOnClickListener {

            val intent = Intent(this, CategoryActivity::class.java)

            intent.putExtra("username", username.toString())

            startActivity(intent)
        }









    }
}