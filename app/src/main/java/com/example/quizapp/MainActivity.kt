package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnStart=findViewById<Button>(R.id.btnStart)
        var et=findViewById<EditText>(R.id.et)
        btnStart.setOnClickListener(){
            if(et.text.isEmpty()){
                Toast.makeText(this,"Enter your name first",Toast.LENGTH_LONG).show()
            }
            else{
                val intent=Intent(this,QuizQuestions::class.java)
                intent.putExtra(Constants.USER_NAME,et.text.toString())
                startActivity(intent)
            }
        }
    }
}