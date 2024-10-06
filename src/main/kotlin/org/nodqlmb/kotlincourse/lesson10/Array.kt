package org.nodqlmb.kotlincourse.lesson10

fun main() {

//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numbers.toList())

//Создайте пустой массив строк размером 10 элементов.
    val emptyArray = Array(size = 10) { "" }
    println(emptyArray.toList())

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array = Array(5) { 1.0 }
    for (i in array.indices) {
        array[i] = i * 2.0
    }
    println(array.toList())

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val array1 = Array(5) { 0 }
    for (i in array1.indices) {
        array1[i] = (i * 3)
    }
    println(array1.toList())

//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val array2 = arrayOfNulls<String?>(3)
    array2[0] = null
    array2[1] = "string"
    array2[2] = "string"
    println(array2.toList())

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val initialArray = arrayOf(1, 2, 3, 4, 5)
    val newArray = Array(5) { 0 }
    for (i in initialArray.indices) {
        newArray[i] = initialArray[i]
    }
    println(newArray.toList())


//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    val dimArray = arrayOf(5, 6, 7, 8, 9)
    val dedArray = arrayOf(1, 2, 3, 4, 5)
    val diffArray = Array(5) { 0 }
    for (i in dimArray.indices) {
        diffArray[i] = dimArray[i] - dedArray[i]
    }
    println(diffArray.toList())

//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    val indexArray = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var i = 0
    while (i < indexArray.lastIndex) {
        if (indexArray[i] == 5) {
            println(indexArray[i])
        } else {
            println(-1)
        }
        i++
    }

//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val enumArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (index in enumArray.indices) {
        if (enumArray[index] % 2 == 0) {
            println("${enumArray[index]} - чётное")
        } else {
            println("${enumArray[index]} - нечётное")
        }
    }
    //Создай функцию, которая принимает массив строк и строку для поиска.
//Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//Верни найденный элемент из функции в виде строки.
    fun findElement(array: Array<String>, findString: String): String {
        for (i in array) {
            if (i.contains(findString)) {
                return (i)
            }
        }
        return ("Empty")
    }

}
