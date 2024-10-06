package org.nodqlmb.kotlincourse.lesson10

fun main() {

//Создайте пустое неизменяемое множество целых чисел.
    val set = setOf<Int>()
    println(set)

//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val shortSet = setOf(1, 2, 3)
    println(shortSet)

//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val languageSet = mutableSetOf("Kotlin", "Java", "Scala")
    println(languageSet)

//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val extendedSet = mutableSetOf("Kotlin", "Java", "Scala")
    extendedSet.add("Swift")
    extendedSet.add("Go")
    println(extendedSet)

//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val purgeSet = mutableSetOf(1, 2, 3, 4, 5)
    purgeSet.remove(2)
    println(purgeSet)

//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val outputSet = setOf(1, 2, 3, 4, 5, 6)
    for (i in outputSet){
        println(i)
    }

//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Вернуть булево значение true если строка есть. Реши задачу через цикл.
    val searchSet = setOf("Районы", "кварталы", "жилые", "массивы")
    var result: Boolean = false

    for (i in searchSet){
        if (i == "жилые")
            result = true
    }

    println(result)
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
//Реши задачу с помощью циклов.
    val townSet = setOf("Москва", "Санкт-Петербург", "Пермь", "Уфа", "Хабаровск", "Бишкек")
    val locationSet = setOf("Иркутск","Анадырь","Казань", "Салехард", "Москва", "Воронеж")
    val placesSet = mutableSetOf<String>()
    for (i in townSet) {
        placesSet.add(i)
    }

    for (i in locationSet) {
        placesSet.add(i)
    }

    println(placesSet)

//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val firstSet = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val secondSet = setOf(5, 6, 7, 8, 9, 10, 11, 12, 13)
    val inCommonSet = mutableSetOf<Int>()
    for(i in firstSet) {
        if (secondSet.contains(i)){
            inCommonSet.add(i)
        }
    }
    println(inCommonSet)

//Создайте два множества строк и найдите разность первого множества относительно второго
//(элементы, присутствующие в первом множестве, но отсутствующие во втором).
//Реши задачу через вложенные циклы и переменные флаги.


//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val setToList = setOf("Дым", "табачный", "воздух", "выел")
    val list11 = mutableListOf<String>()
    for (i in setToList){
        list11.add(i)
    }
    println(list11)
}