fun main() {
    var a: Int = 1
    var b: Int = 2
    var result: Int = sum2(a,b)    //sum(a,b)
    println("$a + $b = $result")
}

fun sum(a: Int, b: Int): Int{
    return a+b
}

fun sum2(a: Int, b: Int): Int = a+b

