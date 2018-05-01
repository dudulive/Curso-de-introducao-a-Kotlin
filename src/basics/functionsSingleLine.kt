package basics

fun hello2() = println("Hello")

fun toUpperCase2(str: String) =  str.toUpperCase()

fun firstLetter2(str: String, index: Int) : Char = str[index]

fun whichNumberIsBigger(n1: Int, n2: Int) = if(n1 > n2) n1 else n2

fun main(args: Array<String>) {
    hello2()
    println(toUpperCase2("edu"))
    println(firstLetter2("edu", 0))
    println(whichNumberIsBigger(1, 2))
}