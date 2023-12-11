package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import android.content.Intent
//

class QuizQuestions : AppCompatActivity() {
    var progressBar:ProgressBar?=null
    var tvprogress:TextView?=null
    var tvquestions:TextView?=null
    var image:ImageView?=null
    var questionone:TextView?=null
    var questiontwo:TextView?=null
    var questionthree:TextView?=null
    var questionfour:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        progressBar=findViewById(R.id.pb)
        tvprogress=findViewById(R.id.tvbar)
        tvquestions=findViewById(R.id.tvquestions)
        image=findViewById(R.id.image)
        questionone=findViewById(R.id.tvoptionone)
        questiontwo=findViewById(R.id.tvoptiontwo)
        questionthree=findViewById(R.id.tvoptionthree)
        questionfour=findViewById(R.id.tvoptionfour)
       val questionsList = Constants.getQuestion()

//
      // for (i in questionsList) {
      //   Log.e("question is", i.question)
//       }
//        var currentposition=0
//        val Question:Question=questionsList[currentposition]
//        progressBar?.progress=currentposition
//        tvprogress?.text="$currentposition/${progressBar?.max}"
//        tvquestions?.text=Question.question
    }}
