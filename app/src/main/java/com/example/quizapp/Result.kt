package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvname=findViewById<TextView>(R.id.UNtv)
        val score=findViewById<TextView>(R.id.scoretv)
        val btnfinish=findViewById<Button>(R.id.btnfinish)

        tvname.text=intent.getStringExtra(Constants.USER_NAME)

        var totalquestion=intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        var correctanswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        score.text="Your score is $correctanswers out of $totalquestion"

        btnfinish.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}