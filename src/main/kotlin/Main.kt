package org.example

import kotlin.math.pow

fun main() {
    // ЗАНЯТИЕ 1

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
    val (i, o, p) = readln().split(" ").map { it.toInt() }
    println("${i.toInt()}, ${o.toInt()}, ${p.toInt()}")

    // ЗАНЯТИЕ 2
    // Условный оператор if-else
    if (a > b) {
        println(a)
    } else if (a == b) {
        println("a==b")
    } else {
        println(b)
    }
    // Условный оператор when
    when (a > b) {
        true -> {
            println(a)
        }

        false -> {
            println(b)
        }

        else -> {
            println("a==b")
        }
    }

    val day = 6
    val dayName = when (day) {
        1 -> "Пн"
        2 -> "Вт"
        3 -> "Ср"
        4 -> "Чт"
        5 -> "Пт"
        6, 7 -> "Праздник"
        else -> "Некоректный день"
    }
    println(dayName)

    // Логические операторы
    // "ИЛИ"
    if (true || false) {
        println("True or false")
    }
    // "И"
    if (false && false) {
        println("True and true")
    } else println("False and false")
    // "НЕ"
    if (!false) {
        println("Not false")
    }

    // Циклы
    // FOR
    for (j in 1..5) {
        if (j == 2)
            continue
        println(j)
    }

    println("UNTIL")
    for (j in 1 until 5) {
        println(j)
    }

    println("STEP")
    for (j in 1..10 step 5) {
        println(j)
    }

    println("DownTo")
    for (j in 10 downTo 5) {
        println(j)
    }

    // WHILE и DO-WHILE
    var l = 5
    println("WHILE")
    while (l > 0) {
        println(l)
        l--
    }

    var num = 0
    println("DO-WHILE")
    do {
        if (num == 3)
            break
        println(num)
        num++
    } while (num < 5)

    // NULL безопастность
    println("NULL безопастность")
    var s: String? = "Hello"
    for (w in s!!) {
        if (w == 'e') {
            s = null
        }
        println(w)
    }

    // Коллекции
    // Массив
    val array = arrayOf<Int>(1, 2, 3, 4)
    val intArray = intArrayOf(1, 2, 3)
    val emptyArray = emptyArray<Int>()

    array[0] = 10
    println(array.size)
    println(array.first())
    println(array.last())
    println(array.indexOf(4))
    println(array.contains(2))

    // Список
    val list = listOf(1, 2, 3, 5)
    val mutableList = mutableListOf("W", "feaf", "1e")
    // Операции с изменяемым списком
    mutableList.add("5") // Добавление в конец
    mutableList.add(2, "Yfsav") // Добавление в индекс
    mutableList.addAll(listOf("FSaf", "asfaskmf")) // Добавление списка в конец
    mutableList.addAll(1, listOf("111", "2")) // Добавление списка в индекс

    mutableList.subList(0, 5) // Подсписок

    mutableList.remove("5") // Удаление элмента по значению
    mutableList.removeAt(2) // Удаление элемента по индексу
    mutableList.clear() // Очистка списка

    // Множество
    val mutableSet1 = mutableSetOf(1, 2, 3, 4)
    val mutableSet2 = mutableSetOf(4, 5, 6, 7)
    // Операции над множеством
    println("Объединение множест ${mutableSet1.union(mutableSet2)}")
    println("Пересечение множест ${mutableSet1.intersect(mutableSet2)}")
    println("Разность множест ${mutableSet1.subtract(mutableSet2)}")

    // Ассоциативный массив
    val mutableMap = mutableMapOf(1 to "1", "Str" to 3, false to "r")
    mutableMap[1] = false
}