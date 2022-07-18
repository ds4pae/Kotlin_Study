package chap03.section3

fun highFunc1(sum: (Int,Int) -> Int, a: Int, b: Int): Int{
    return sum(a,b)
}

fun highFunc2(a: Int, b: Int, sum: (Int,Int) -> Int): Int{
    return sum(a,b)
}

fun main() {
    var result1 = highFunc1({x, y -> x + y} , 1, 3)

    var result2 = highFunc2(1, 3) {x, y -> x + y}

    println(result1)
    println(result2)
}