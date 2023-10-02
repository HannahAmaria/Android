package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.myquizapp.databinding.ActivityHomeBinding
import com.example.myquizapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view: LinearLayout = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            var username = binding.username.text

            if (username != null) {
                if(username.isBlank()) {
                    Log.d("AAA Captured username: ", "Please fill in username")
                } else {
                    Log.d( "AAA Captured username: ", username.toString())

                    val intent = Intent(this, CategoryActivity::class.java)

                    intent.putExtra("username", username.toString())

                    startActivity(intent)
                }
            }

        }


    }
}

