package chap03.section1

fun sum(a: Int = 2, b: Int = 5): Int{
    return a + b
}
fun sum2(a: Int, b: Int) = a + b


fun max(a: Int,b: Int): Int{
    return if(a > b) a else b
}
fun max2(a: Int,b: Int) = if(a > b) a else b

fun outfunc(name:String):Unit{
    println("Name : $name")
}
fun outfunc2(name:String) = println("Name : $name")

fun main() {
    val result1 = sum()
    val result3 = sum(2)
    val result4 = sum(b = 3)

    val a = 3
    val b = 5

    val result2 = max(a,b)
    outfunc("Changju")
    println(result1)
    println(result2)
    println(result3)
    println(result4)

}

