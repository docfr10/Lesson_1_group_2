package org.example

import kotlin.math.pow

fun main() {
    // Печать в консоль
    print("Hi!\nExample!\n")
    println("Hello World!")
    print("Hi again!\n")

    // Изменяемая переманная
    var a = 10
    println(a)
    a = 20
    println(a)
    a = 30
    println(a)
    a = 40

    // Строковая интерполяция
    println("A is ..." + (a + 10))
    println("A is ...${a + 10}")

    // Неизменяемая переменная
    val b = 30
    println(b)

    // Явная инициализация типа данных
    val c: Int = 10
    val d: Float = 10.9F
    val e: Char = 'e'
    val f: String = "Something..."
    val g: Boolean = false

    // Неявная инициализация типа данных
    val c1 = 10
    val d1 = 12.9
    val e1 = 'e'
    val f1 = "Something..."
    val g1 = true

    /*
       ТИПЫ ДАННЫХ В KOTLIN
       Числовые типы данных:
        Целочисленные:
            1) Byte
            2) Short
            3) Int
            4) Long
        С плавающей точкой
            1) Float
            2) Double
       Символьные типы данных: Char
       Строковые тип данных: String
       Логический тип данных: Boolean
     */

    // Арифметические операции
    println("\nАрифметические операции")
    println(c + c1)
    println(d - d1)
    println(a * b)
    println(d1.pow(2))
    println(c.toFloat().pow(2))
    println(a / c)
    println(c % a)

    // Операторы присваивания
    var plus = 1
    plus += a
    plus -= a
    plus *= a
    plus /= a
    plus %= a

    // Операторы сравнения
    println("\nОператоры сравнения")
    println(f == f1)
    println(f != f1)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    // Ввод в консоль
    println("\nВвод в консоль")
    val r = readln().trim()
    println(r)
    println("\nВвод в консоль нескольких чисел через пробел")
    val (i, o, p) = readln().split(" ")
    println("${i.toInt()}, ${o.toInt()}, ${p.toInt()}")
}