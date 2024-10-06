//package org.nodqlmb.kotlincourse.lesson10
fun main() {

//Создайте пустой неизменяемый список целых чисел.
    val emptyList = listOf<Int>()
    println(emptyList)

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    val welcomeList = listOf("Hello", "World", "Kotlin")
    println(welcomeList)

//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val mutList = mutableListOf(1, 2, 3, 4, 5)
    println(mutList)
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val addList = mutableListOf(1, 2, 3, 4, 5)
    addList.add(6)
    addList.add(7)
    addList.add(8)
    println(addList)
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    val worldlessList = mutableListOf("Hello", "World", "Kotlin")
     worldlessList.remove("World")
    println(worldlessList)

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in list){
        println(i)
    }

//Создайте список строк и получите из него второй элемент, используя его индекс.
    val elementList = listOf("Барнаул", "Алтайский", "край")
    println(elementList[1])

//Имея изменяемый список чисел, измените значение элемента на определенной позиции
// (например, замените элемент на позиции 2 на новое значение).
    val changeList = mutableListOf("Если б я", "был султан", "я б имел", "трёх", "жён")
    changeList[3] = "сто"
    println(changeList)

//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
// Реши задачу с помощью циклов.

    val insideList = listOf("Инженер", "Нателла Наумовна", "Роза-Робот")
    val lapenkoList = listOf("Игорь Катамаранов", "Жилин", "Зина Кашина")
    val insideLapenkoList = mutableListOf<String>()
    for (element in insideList){
        insideLapenkoList.add(element)
    }
    for (element in lapenkoList){
        insideLapenkoList.add(element)
    }
    println(insideLapenkoList)

//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

    val randomList = listOf(0, 1000000000, -666, 9000, 69, -12345678, 11111)
    var minValue = 0
    var maxValue = 0
    for (i in randomList) {
        if (i < minValue) {
            minValue = i
        }
        if (i > maxValue) {
            maxValue = i
        }
    }
    println("Минимальное значение $minValue")
    println("Максимальное значение $maxValue")

//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val everyList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val evenList = mutableListOf<Int>()
    for (i in everyList){
        if (i % 2 == 0){
            evenList.add(i)
        }
    }
    println(evenList)
}