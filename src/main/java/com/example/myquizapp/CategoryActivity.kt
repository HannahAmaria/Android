package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityCategoryBinding
import com.google.android.material.snackbar.Snackbar

class CategoryActivity : AppCompatActivity() {

    lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCategoryBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        setContentView(view)

        val username = intent.getStringExtra("username")

        Log.d("AAA Welcome", username.toString())

        binding.name.text = "Welcome $username"

        binding.easy.setOnClickListener {
            val intent = Intent(this, EasyQuestionActivity::class.java)

            intent.putExtra("username", username.toString())
            startActivity(intent)
            finish()
        }

        binding.medium.setOnClickListener {
            val intent = Intent(this, MediumQuestionActivity::class.java)


            intent.putExtra("username", username.toString())

            startActivity(intent)
            finish()
        }


        binding.hard.setOnClickListener {
            val intent = Intent(this, HardQuestionActivity::class.java)

            intent.putExtra("username", username.toString())

            startActivity(intent)
            finish()
        }

        binding.score.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)

            val lastUser = sharedPref.getString("last_user", "No user found")
            val lastScore = sharedPref.getInt("last_score", 0)

            Log.d("AAA LAST USER FROM", lastUser + lastScore.toString())

            val snack = Snackbar.make(it, "Your previous score was", Snackbar.LENGTH_LONG)
            snack.setAction(lastScore.toString(), View.OnClickListener{

            })
            snack.show()
        }

        binding.back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            finish()
        }

    }
}