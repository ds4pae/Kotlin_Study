package chap05.section1

fun main() {

    print("Enter the score: ")
    val score = readLine()!!.toDouble()

    var grade: Char = 'f'

    if (score >= 90.0){
        grade = 'A'
    }else if (score >= 80 && score <= 89.9){
        grade = 'B'
    }else if (score >= 70 && score <= 79.9){
        grade = 'c'
    }

    println("score : $score, grade: $grade")

}