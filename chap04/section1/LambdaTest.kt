package chap04.section1

fun main() {

    val result : Int

    //val multi = { a: Int, b: Int -> a * b }
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a , b: $b")
        a * b
    }

    //result = multi(10,20)
    //println(result)

    val greet1: () -> Unit = { println("Hello")}
    val greet2 = { println("Hello")} //자료형 생략 가능

    //greet1()

    val sqrt: (Int)->Int = { x -> x * x}

    var result2 = sqrt(5)
    //println(result2)

    val nestedLambda: () -> () -> Unit = { { println("nested") } }
    nestedLambda()

}