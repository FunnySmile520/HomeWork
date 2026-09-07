fun main() { //main - это базаааа
    val city = "Moscow" //переменная названия города (неизм)
    val year_smth = 1147 //переменная года основания (неизм)
    var temperature = 12.12 //переменная температуры (изм)
    val capital = true //переменная столицы (неизм) такая себе 'переменная'

    println("Город: ${city}, в ${year_smth} году. Температура: ${temperature}. Столица: ${capital}") //вывод инфы

    temperature = 13.13 //изменение температуры

    println("Город: ${city}, в ${year_smth} году. Температура: ${temperature}. Столица: ${capital}") //вывод новой инфы
}