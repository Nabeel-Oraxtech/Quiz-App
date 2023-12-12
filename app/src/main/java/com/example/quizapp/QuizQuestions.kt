package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat


class QuizQuestions : AppCompatActivity(), View.OnClickListener {
    var currentposition:Int=1
    var questionList:ArrayList<Question>?=null
    var selectedOption:Int=0

    var progressBar:ProgressBar?=null
    var tvprogress:TextView?=null
    var tvquestions:TextView?=null
    var image:ImageView?=null
    var questionone:TextView?=null
    var questiontwo:TextView?=null
    var questionthree:TextView?=null
    var questionfour:TextView?=null
    var btnsubmit:Button?=null



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
        btnsubmit=findViewById(R.id.btnsubmit)

        questionone?.setOnClickListener(this)
        questiontwo?.setOnClickListener(this)
        questionthree?.setOnClickListener(this)
        questionfour?.setOnClickListener(this)
        btnsubmit?.setOnClickListener(this)

        questionList = Constants.getQuestions()

        setQuestion()


    }

    private fun setQuestion() {

        val question: Question = questionList!![currentposition - 1]
        image?.setImageResource(question.image)
        progressBar?.progress = currentposition
        tvprogress?.text = " ${currentposition}/${progressBar?.max} "
        tvquestions?.text = question.questions

        questionone?.text = question.optionOne
        questiontwo?.text = question.optionTwo
        questionthree?.text = question.optionThree
        questionfour?.text = question.optionFour

        if(currentposition == questionList!!.size){
            btnsubmit?.text="FINISH"
        }
        else{
            btnsubmit?.text="SUBMIT"
        }
    }

    fun defaultoptionview(){
        var options=ArrayList<TextView>()
        questionone?.let{
            options.add(0,it)
        }
        questiontwo?.let{
            options.add(1,it)
        }
        questionthree?.let{
            options.add(2,it)
        }
        questionfour?.let{
            options.add(3,it)
        }
        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this,
                 R.drawable.default_option_border_bg
                //R.drawable.selected_option_border_bg
            )
        }
    }
    fun selectedoptionview(tv:TextView,selectedoptionnum:Int){
        defaultoptionview()
        selectedOption=selectedoptionnum
        tv.setTextColor(Color.parseColor("#1a2b3c"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tvoptionone ->{
                questionone?.let {
                    selectedoptionview(it, 1)

                }
            }
            R.id.tvoptiontwo ->{
                questiontwo?.let {
                    selectedoptionview(it, 2)

                }
            }
            R.id.tvoptionthree ->{
                questionthree?.let {
                    selectedoptionview(it, 3)

                }
            }
            R.id.tvoptionfour ->{
                questionfour?.let {
                    selectedoptionview(it, 4)

                }

            }
            R.id.btnsubmit->{
                if(selectedOption==0){
                    currentposition++
                    when{currentposition<=questionList!!.size->{
                        setQuestion()
                    }
                }}
                else{
                    val que=questionList?.get(currentposition-1)
                    if(que!!.correctAns!=selectedOption){
                        answerview(selectedOption, R.drawable.wrong_option_border_bg)
                    }
                       answerview(que.correctAns,R.drawable.correct_option_border_bg)

                }
            }
        }
    }
    fun answerview(answer:Int,drawableView:Int){
        when(answer){
            1->{
                questionone?.background=ContextCompat.getDrawable(this,drawableView)
            }
            2->{
                questiontwo?.background=ContextCompat.getDrawable(this,drawableView)
            }
            3->{
                questionthree?.background=ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                questionfour?.background=ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
}
