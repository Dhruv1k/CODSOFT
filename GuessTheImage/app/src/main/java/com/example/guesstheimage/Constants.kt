package com.example.guesstheimage

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Guess the brand",
            R.drawable.ic_hul,
            "Bajaj", "Unilever", "Dabur", "Nestle", 2
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "Guess the brand",
            R.drawable.ic_adidas,
            "Puma", "Nike", "New Balance", "Adidas", 4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "Guess the brand",
            R.drawable.ic_adobe,
            "Adobe", "Aramco", "Amazon", "Accenture", 1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Guess the brand",
            R.drawable.ic_beats,
            "BBC", "Bosch", "Beats", "Biocon", 3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "Guess the brand",
            R.drawable.ic_mitsubishi,
            "Mitsubishi", "Mazda", "Toyota", "Subaru", 1
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "Guess the brand",
            R.drawable.ic_paypal,
            "Paytm", "Phone Book", "Paypal", "PhonePe", 3
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "Guess the brand",
            R.drawable.ic_rolex,
            "Rado", "Armani", "Omega", "Rolex", 4
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "Guess the brand",
            R.drawable.ic_starbucks,
            "Sardar Buksh", "Starbucks", "Café Coffee Day", "Subko Coffee", 2
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "Guess the brand",
            R.drawable.ic_target,
            "Costco", "Walmart", "Dollar Tree", "Target", 4
        )
        questionsList.add(que9)

        return questionsList
    }
}