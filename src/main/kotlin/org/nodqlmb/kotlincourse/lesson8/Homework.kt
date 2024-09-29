package org.nodqlmb.kotlincourse.lesson8

fun main () {

    //println(convert(phrase))
    //println(secondConvert(secondPhrase))
    //println(thirdConvert(thirdPhrase))
    //println(fourthConvert(fourthPhrase))
    //println(fifthConvert(fifthPhrase))

//"Это невозможно выполнить за один день"
//Замените "невозможно" на "совершенно точно возможно, просто требует времени"
    var phrase = "Это невозможно выполнить за один день."
 fun convert(phrase: String): String {
     return when {
         phrase.contains("невозможно", true) -> phrase.replace(
             "невозможно",
             "совершенно точно возможно, просто требует времени"
         )
         else -> ""
     }
 }
//Если фраза начинается с "Я не уверен":
////Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

var secondPhrase = "Я не уверен в успехе этого проекта"
     fun secondConvert(secondPhrase: String): String{
         return when{
             secondPhrase.startsWith("Я не уверен") ->
                 { "$secondPhrase ... ,но моя интуиция говорит об обратном"}
                    else -> ""
                 }
             }


//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".


var thirdPhrase = "Произошла катастрофа на сервере"

    fun thirdConvert (thirdPhrase: String): String {
        return thirdPhrase.replace("катастрофа", "интересное событие")
    }


//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".

    var fourthPhrase = "Этот код работает без проблем"

    fun fourthConvert (fourthPhrase: String): String {
        return when {
            fourthPhrase.endsWith("без проблем") ->
                fourthPhrase.replace("без проблем", "с парой интересных вызовов на пути")
            else -> ""
        }
    }

    //Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    var fifthPhrase = "Удача"

    fun fifthConvert (fifthPhrase: String): String {
        return when {
            fifthPhrase.endsWith(" ") -> ""
            else -> "Иногда $fifthPhrase, но не всегда"
        }
    }
}

//Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

fun dateTime () {
    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val data = log.split(" ")
    val date = data[5]
    val time = data[6]

    println(date)
    println(time)

}
//Маскирование Личных Данных
////Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
//// Замаскируйте все цифры, кроме последних четырех, символами "*".

fun creditCard(number: String) {
    val splitNumber = number.split(" ")
    return println("**** **** **** ${splitNumber[3]}")
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".

fun Email (email: String) {

        val newEmail = email.replace("@", " [at] ")
            email.replace(".", " [dot] ")
        return println(newEmail)
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

fun filePath(path: String){
    val splitPath = path.split("/")
    return println(splitPath.last())

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
// Используй for для перебора слов. Используй var переменную для накопления первых букв.


    //fun abbreviation(phrase1: String): String {
        //val abbreviationList = phrase1.split(' ', '-')
        //var abbrPhrase = ""

    //😤😤😤

}
