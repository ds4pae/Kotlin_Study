package chap03.section1

fun normalVarargs(vararg a: Int){
    for(num in a){
        print(num )
    }
    println()
}

fun main() {
    normalVarargs(1)
    normalVarargs(1, 2, 3, 4)
}