package chap05.section2

fun main() {
    var total = 0
    var total2 = 0

    for (num in 1..100 step 2){ //홀수합
        total += num
    }

    for (num in 0..99 step 2){ //홀수합
        total2 += num
    }

    println("total : $total")
    println("total2 : $total2")
}