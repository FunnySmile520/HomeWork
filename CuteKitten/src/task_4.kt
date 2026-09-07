data class Products(val name: String, val price: Double, val quantity: Int) // дата класс. для хранения данных.

fun printReceipt(products : List<Products>) { //функция вывода
    println("==========ЧЕК==========") //Чек. что тут скажешь?
    var Final_Price : Double = 0.00 //создание переменной финальной цены
    for (product in products) { //цикл for, повторяющийся столько раз, сколько элементов в листе Useful_things
        val Expensive_Thing = product.price * product.quantity //создание переменной цены, тут видно
        println("Товар: ${product.name} | Цена: ${product.price}₽ | Кол-во: ${product.quantity} | Сумма: ${Expensive_Thing}") //вывод
        Final_Price += Expensive_Thing //прибавка к итоговой цене
    }
    println("=======================") //=======================
    println("ИТОГО: ${String.format("%.2f", Final_Price)}₽") //Итого. вывод
}

fun main() { //божечки-кошечки, сколько это будет продолжаться...
    val Useful_Things = listOf( //список продуктов и инфа о них
        Products("AD (Air Defense)", 59.99, 2), //первый эелемент
        Products( "GTA IV", 999999.99, 1), //второй элемент, по скидке
        Products("Nuke", 0.99, 5) //может кому надо, третий элемент
    )
    printReceipt(Useful_Things) //вызов функции
}