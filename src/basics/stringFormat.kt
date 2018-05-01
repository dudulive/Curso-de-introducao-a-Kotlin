package basics

fun main(args: Array<String>) {

    val name = "Edu " +
            " Rodrigues " +
            " Braz"

    val name2 = """ Edu
        |Rodrigues
        |Braz
    """.trimMargin()

    println(name)
    println(name2)

    val name3 = "Edu"

    println("Olá ${name3.length}")
    println("Olá ${name3[0]}")
}