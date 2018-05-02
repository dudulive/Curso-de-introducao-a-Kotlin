package basics

import java.util.*

fun whatHapenned(year: Int) =
        if(year == 2017)
            "Ano passado"
        else if(year >= 2018 || year <= 2020)
            "Não sei do Futuro"
        else
            "Não sei"

fun whatHapenned2(year: Int) = when(year){
     2017 ->  "Ano passado"
     2018, 2020 -> "Não sei do Futuro"
    else -> "Não sei"
}

fun whatHapenned3(year: Int) : String {
    when {
        year == 2017 -> return  "Ano passado"
        year >= 2018 || year <= 2020 -> return "Não sei do Futuro"
        else -> return "Não sei"
    }
}

fun main(args: Array<String>) {
    val calendar : Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)

    print(whatHapenned3(year))
}