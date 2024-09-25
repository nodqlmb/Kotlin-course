package org.nodqlmb.kotlincourse.lesson6

fun main () {
    println(seasons(month))
    println(petToHumanAge(petAge))
    println(vehicleOfChoice(distance))
    println(calculateBonus(purchaseAmount))
    println(fileType(fileExtension))
    println(clothes(outdoorTemperature))
    println(ageLimitation(age))
    println(tempConversion(temperature, scale))
    println(tempConversion(20.0, "C"))

}
//Задание 1: "Определение Сезона"
//Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
    var month = 8
    fun seasons(month: Int): String {
        return when (month) {
            in 1..2, 12 -> "Winter"
            in 3..5 -> "Spring"
            in 6..8 -> "Summer"
            in 9..11 -> "Autumn"
            else -> "Invalid month"
        }
    }
//Задание 2: "Расчет Возраста Питомца"
//Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
        var petAge: Double = 4.0

        fun petToHumanAge(petAge: Double): Any {
            return if (petAge <= 2.0) {
                petAge * 10.5
            } else (petAge - 2) * 4 + 21
        }

//Задание 3: "Определение Вида Транспорта"
//Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

    var distance: Double = 10.0

    fun vehicleOfChoice(distance: Double) : String {
        return if (distance < 1.0)  {
            "Walk"
        } else if (distance in 1.0..4.0) {
            "Ride a bike"
        } else {
            "Drive a car"
        }
    }
//Поменяй в предыдущих двух на double

//Задание 4: "Расчет Бонусных Баллов"
//Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
//2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

var purchaseAmount: Int = 1666 //

fun calculateBonus(purchaseAmount: Int) : Int {
   //если нужно проверить валидность и вбросить исключение, то его сюда
    //второй строкой можно создать переменную для сокращения кода
    //например val dif = purchaseAmount / 100
    return when  {
        purchaseAmount < 1000 -> purchaseAmount / 100 * 2
        purchaseAmount >= 1000 -> purchaseAmount / 100 * 5
        else -> 0
    }
}


//Задание 5: "Определение Типа Документа"
//Контекст: В системе хранения документов каждый файл имеет расширение. Напишите функцию,
//которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение",
//"Таблица" или "Неизвестный тип".

var fileExtension: String = ".xls"
fun fileType(fileExtension: String): String {
        return when (fileExtension) {
            in "txt", "doc", "docx" -> "Текстовый документ"
            in "jpg", "png" -> "Изображение"
            in "xls", "xlsx" -> "Таблица"
            else -> "Неизвестный тип"
        }
    }

//Задание 6: "Конвертация Температуры"
//Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
//в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
//Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шаблон “$result F” для фаренгейта
//или “$result C” для цельсия

var temperature: Double = 77.0
var scale: String = "F"
fun tempConversion(temperature: Double, scale: String): String {
    return when (scale) {
        "C" -> {
            val result = temperature * 9 / 5 + 32
            "$result F"
        }
        "F" -> {
            val result = (temperature - 32) * 5 / 9
            "$result C"
        }
        else -> {
            "Invalid scale"
        }
    }
}

//Задание 7: "Подбор Одежды по Погоде"
//Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при
//температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

    var outdoorTemperature: Int = 8

    fun clothes(outdoorTemperature: Int) : String {
        return when (outdoorTemperature) {
            in -30..0 -> "куртка и шапка"
            in 0..14 -> "ветровка"
            in 15..35 -> "футболка и шорты"
            else -> "сидим дома"
        }
    }

//Задание 8: "Выбор Фильма по Возрасту"
// Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские",
// "подростковые", "18+".

var age: Int = 8
    fun ageLimitation(age: Int): String {
        return when(age) {
            in 0..10 -> "детские"
            in 11..17 -> "детские, подростковые"
            else -> "детские, подростковые, 18+"
        }
    }


