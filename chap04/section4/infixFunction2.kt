package chap04.section3

fun main() {
    //val multi = 3.multiply(10)

    val num = 3
    //var str = num.strPlus("Kotlin")
    var str = num strPlus "Kotlin"
    println(str)
}

infix fun Int.strPlus(x: String): String {
    return "$x version $this"
}
