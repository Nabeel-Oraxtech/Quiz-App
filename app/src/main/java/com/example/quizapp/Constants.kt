package com.example.quizapp

object Constants{
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTION:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"
fun getQuestions():ArrayList<Question>{
    val questionList=ArrayList<Question>()
    val que1=Question(
        1,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_belgium,
        "India","China","Africa","Belgium",4
    )
    questionList.add(que1)
    //2
    val que2=Question(
        2,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_argentina,
        "India","Argentina","Africa","Belgium",2
    )
    questionList.add(que2)
    //3
    val que3=Question(
        3,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_brazil,
        "Brazil","China","Africa","Belgium",1
    )
    questionList.add(que3)
    //4
    val que4=Question(
        4,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_australia,
        "India","China","Australia","Belgium",3
    )
    questionList.add(que4)
    //5
    val que5=Question(
        5,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_denmark,
        "India","Denmark","Fiji","Belgium",2
    )
    questionList.add(que5)
    //6
    val que6=Question(
        6,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_fiji,
        "India","Fiji","Africa","Germany",2
    )
    questionList.add(que6)
    //7
    val que7=Question(
        7,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_germany,
        "India","China","Germany","Belgium",3
    )
    questionList.add(que7)
    //8
    val que8=Question(
        8,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_india,
        "India","China","Africa","Kuwait",1
    )
    questionList.add(que8)
    //9
    val que9=Question(
        9,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_kuwait,
        "India","Kuwait","New Zealand","Belgium",2
    )
    questionList.add(que9)
    //10
    val que10=Question(
        10,"Which country does this flag belong to?",
        R.drawable.ic_flag_of_new_zealand,
        "India","China","New Zealand","Belgium",3
    )
    questionList.add(que10)

    return questionList
}}

