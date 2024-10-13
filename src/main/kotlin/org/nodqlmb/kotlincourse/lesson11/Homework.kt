package org.nodqlmb.kotlincourse.lesson11

fun main() {

//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()
    println(emptyMap)
//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val fDMap = mapOf<Float, Double>(1.1f to 1.1, 2.2f to 2.2, 3.3f to 3.3)
    println(fDMap)
//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap = mutableMapOf<Int, String>()
    println(mutableMap)
//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    mutableMap[52] = "Да здравствует Санкт-Петербург(А!), и этот город наш!"
    mutableMap [2128506] = "это твой номер номер номер номер номер"

    println(mutableMap)
//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//Попробуй получить значение с ключом, которого в словаре нет.

    println(mutableMap[2128506])
    println(mutableMap[666])

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

    mutableMap.remove(52)
    println(mutableMap)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val divMap = mapOf (0.0 to 0, 1.0 to 1, 2.1 to 2)

    for (entries in divMap) {
        if (entries.value != 0) {
            println(entries.key / entries.value)
        }
        else println("бесконечность")
    }

//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

    val changeMap = mutableMapOf<Int, String>(1 to "Когда", 2 to "вырасту", 3 to "стану", 4 to "квадробером")
    println(changeMap)
    changeMap[4] = "хоббихорсером"

    println(changeMap)
//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
 val firstMap = mapOf(1 to "Ублюдок", 2 to "мать твою", 3 to "а ну иди сюда")
 val secondMap = mapOf(4 to "говно собачье", 5 to "жлоб вонючий")
 val summaryMap = mutableMapOf<Int,String>()
    for ((key,value) in firstMap){
        summaryMap[key] = value
    }
    for ((key, value) in secondMap){
        summaryMap[key] = value
    }
println(summaryMap)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
//Добавьте несколько элементов в этот словарь.

    val addMap = mapOf<String, List<Int>>("Брат" to listOf(1, 2), "Шрек" to listOf(1, 2, 3, 4),
        "Ментовские войны" to listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    )
    println(addMap)

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
//Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
//Распечатай полученное множество.
    val firstSet = mutableSetOf("Две мясных котлеты гриль", "специальный соус", "сыр")
    val secondSet = mutableSetOf("огурцы", "салат", "лук")
    val thirdSet= mutableSetOf("все на булочке с кунжутом", "только так")
    val map = mapOf<Int, MutableSet<String>>(1 to firstSet, 2 to secondSet, 3 to thirdSet)
    println(map)
    val addSet = map[3]
    addSet?.add("И это Биг Мак")
    println(addSet)
    println(map)

/*
Задание 12: Поиск Элемента по Значению

Создай словарь, где ключами будут пары чисел. Через перебор найди значение у
которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val pairsMap = mapOf(
    Pair(1 to 2) to "First Pair",
    Pair(3 to 4) to "Second Pair",
    Pair(5 to 6) to "Third Pair",
    Pair(7 to 5) to "Fourth Pair",
    )

    for ((key, value) in pairsMap) {
       if (key.first == 5 || key.second == 5) {
           println(String)
        }
    }
  Спросить че я здесь накосячила в чате
  */
    
//Задание 6: Словарь Библиотека 
// Ключи - автор книги, значения - список книг

    val libraryMap = mutableMapOf<String, MutableList<String>>()
        
//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
 
    val plantsMap = mutableMapOf<String, List<String>>()

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val playersMap = mutableMapOf<String, MutableList<String>>()

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

    val medsMap = mutableMapOf<Long, MutableList<String>>()

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

    val travelMap = mutableMapOf<String, MutableMap<String, MutableList<String>>>()
}
