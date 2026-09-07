fun Change(FN : String?, LN : String?, MN : String?): String{ //Функиция, меняющая значение null
    val FN_Changed: String? = FN ?: "[Не указано]" //сменя значения для имени
    val LN_Changed: String? = LN ?: "[Не указано]" //смена значения для фамилии
    val MN_Changed: String? = MN ?: "[Не указано]"// смена значения для отчества
    return "$LN_Changed $FN_Changed $MN_Changed" //возврат в правильном порядке и значении
}
//эта функция идёт раньше основного маина, потому что должна успеть создаться перед вызовом
//должен ли я это описывать?
fun main() { //фигня, без названия которой код не запустится
    var firstName: String? = "Mikhail" //создание переменной имени
    var lastName: String? = "Zubenko" //создания переменной фамилии
    var middleName: String? = "Petrovich" // создание переменной отчества
    println(Change(firstName, lastName, middleName)) //вызов функции в принте
    firstName = "Alisa" //изменение значение имени
    lastName = null //изменение значения фамилии
    middleName = "Yandexovna" //изменение значения отчества
    println(Change(firstName, lastName, middleName)) //вызов функции в принте
    firstName = "Mavuika" //изменение значение имени
    lastName = null //изменение значения фамилии
    middleName = null //изменение значения отчества
    println(Change(firstName, lastName, middleName)) //вызов функции в принте
    firstName = null //изменение значение имени
    lastName = null //изменение значения фамилии
    middleName = null //изменение значения отчества
    println(Change(firstName, lastName, middleName)) //вызов функции в принте
}