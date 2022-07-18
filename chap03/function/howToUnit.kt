fun main() {
    var a: Int = 1
    var b: Int = 2

    printResult(a,b)
}

fun printResult(a: Int, b: Int): Unit{
    var sum: Int = a+b
    println("$a + $b = $sum")
}