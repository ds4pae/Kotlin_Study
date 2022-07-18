package chap04.section2

fun main(){
        moreParam {a ,b -> "Hello World! $a $b"}

        moreParam { _ ,b -> "Hello World! $b" }

}

fun moreParam(out: (String, String) -> String){
        println(out("OneParam", "TwoParam"))
}