package chap04.section3

fun main() {
    //val multi = 3.multiply(10)

    val multi = 3 multiply 10
    println("multi: $multi")
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}
