data class UserProfile(val username: String, val bio: String?, val age: Int?, val city: String?, val isVerified: Boolean) //создание класса

fun generateProfileCard(profile: UserProfile): String { //функция для оформления инфы
    val nameLine = "Имя: ${profile.username}" + if (profile.isVerified) " ✅" else "" //оформление имени верифицированного и нет человека
    val ageLine = "Возраст: ${profile.age?.toString() ?: "не указан"}" //оформление возраста
    val cityLine = "Город: ${profile.city ?: "неизвестен"}" //оформление города
    val bioLine = profile.bio?.takeIf { it.isNotBlank() }?.let { "О себе: $it\n" } ?: "" //оформление 'о себе'

    return """ 
        $nameLine 
        $ageLine 
        $cityLine 
        $bioLine 
    """ //возврат для принта
}

fun main() { //господи, за что мне это Т-Т
    val profiles = listOf( //список акков
        UserProfile( //первый акк
            username = "kotlin_dev", //имя первого акка
            bio = "Люблю Kotlin и котиков", //инфа о первом акке
            age = 21, //возраст первого акка
            city = "Ульяновск", //город первого акка
            isVerified = true //верифицирован ли первы акк
        ),
        UserProfile( //второй акк
            username = "anon_user", //имя второго акка
            bio = null, //биография второго акка (или её отсутствие)
            age = null, //возраст второго акка
            city = "Москва", //город второго акка
            isVerified = false //верифицирован ли второй акк?
        ),
        UserProfile( //третий акк
            username = "ghost", //имя третьего акка
            bio = null, //биография третьего акка
            age = 17, //возрасть третьего акка
            city = null, //город третьего акка
            isVerified = false //верифицирован ли третьий акк
        )
    )

    profiles.forEach { profile -> //цикл
        println(generateProfileCard(profile)) //вызов функции в принте
    }
}