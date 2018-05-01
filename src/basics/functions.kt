package basics

fun hello(){
    println("Hello")
}

fun toUpperCase(str: String) : String{
    return str.toUpperCase()
}

fun firstLetter(str: String, index: Int) : Char{
    return str[index]
}

fun main(args: Array<String>) {
    hello()
    println(toUpperCase("edu"))
    println(firstLetter("edu", 0))
}