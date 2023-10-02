package com.example.myquizapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.putInt
import android.util.Log
import android.widget.LinearLayout
import com.example.myquizapp.databinding.ActivityMainBinding
import com.example.myquizapp.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    lateinit var binding: ActivitySettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySettingsBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root

        setContentView(view)

        binding.btnHome.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        binding.btnScore.setOnClickListener{
            val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
            val editor = sharedPref.edit()

            editor.apply{
                putInt("last_score", 0)
                apply()
            }

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

    }

}


