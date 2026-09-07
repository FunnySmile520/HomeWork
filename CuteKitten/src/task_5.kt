fun calculateDiscountedPrice(originalPrice: Double?, discountPrice: Int?): String{ //функция для подсчётов
    if (originalPrice == null){ //первое условие
        return("Цена не указана") //вывод, елси нет ключевого компонента, цены
    }
    else { //если цена есть
        var discount = 0 //создание переменной итоговой скидки
        if (discountPrice == null){ //ну нет скидки и нет
            discount = 0 //логично
        }
        else if (discountPrice >= 100){ //что бы в минус не уйти, 120% не прикольно
            discount = 100 //логично -_-
        }
        else{ //если норм скидка
            discount = discountPrice //дискаунт = дискаунт
        }
        val Expensive_Thing = originalPrice * (1 - discount / 100.00) //Итог с учётом скидки
        return("Цена: ${originalPrice}, Скидка: ${discountPrice}, ИТОГ: ${Expensive_Thing}")//возврат
    } //не занижайте пожалуйста оценку за мои коменты, я старался
}

fun main(){ //ваще не fun
    println(calculateDiscountedPrice(null, null))//вызов функции в принте
    println(calculateDiscountedPrice(999999.99, null))//вызов функции в принте
    println(calculateDiscountedPrice(null, 12))//вызов функции в принте
    println(calculateDiscountedPrice(59.99, 50))//вызов функции в принте
}