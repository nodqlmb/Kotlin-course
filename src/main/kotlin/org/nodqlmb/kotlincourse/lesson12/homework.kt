package org.nodqlmb.kotlincourse.lesson12

fun main() {

    //Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
    fun emptyFun() {}

    //Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
    fun sum(a: Int, b: Int): Int = a + b

    //Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
    fun string(string: String) {}

    //Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
    fun averageValue(numbers: List<Int>): Double {
        var sum = 0
        var counter = 0
        for (i in numbers.indices) {
            sum += numbers[i]
            counter++
        }
        return (sum / counter).toDouble()
    }

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.

    fun nullableString (string: String?): Int? {
        return string?.length
    }
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
    fun returnDouble (): Double? {
         return null
    }
//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
    fun nullList(numbers: List<Int?>){}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
    fun intToNullString(number: Int): String?{
        return null
    }
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
    fun returnNullStringsList(): List<String?>{
        return listOf("трали-вали", "пассатижи", null)
    }
//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.


    fun returnNulls(s: String?, n: Int?): Boolean? {
        return null
    }

//Задача 1:
// Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

    fun multiplyByTwo(number: Int) = number * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.

    fun isEven(number: Int): Boolean {
        if (number % 2 == 0) {
            return true
        }
        else return false
    }

//Задача 3:
// Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

    fun printNumbersUntil(n: Int) {
        if (n < 1) {
            return
        }
        for (i in 1..n) {
            println(i)
        }
    }


//Задача 4:
// Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное
// число в списке. Если отрицательных чисел нет, функция должна вернуть null.

    fun findFirstNegative(numbers: List<Int>): Int? {
        for (i in numbers) {
            if (i < 0) return i
        }
        return null
    }

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.

    fun processList(strings: List<String?>) {
        for (i in strings) {
            if (i != null) {
                println(i)
            } else {
                return
            }
        }
    }

//Сделай рефакторинг функции, через определение вспомогательных приватных функций.
//Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

    private fun validation (size: Int, name: String) {
        if (size <= 0) throw IllegalArgumentException("$name должно быть положительным и больше нуля")
    }
    private fun horizontalLine(width: Int){
        var line = "+"
        for (i in 1 until width - 1) {
            line += "-"
        }
        line += "+\n"
        print(line)
    }
    private fun verticalLines(lefLine: Int, rightLine: Int){
        for (i in 1 until lefLine - 1) {
            var middleLine = "|"
            for (j in 1 until rightLine - 1) {
                middleLine += " "
            }
            middleLine += "|\n"
            print(middleLine)
        }
    }
    fun drawRectangle(width: Int, height: Int) {
        validation(width, "width")
        validation(height, "height")
    }

//почему ругается на прайват
}