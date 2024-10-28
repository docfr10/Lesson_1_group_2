package org.example.classes

// Абстрактный класс Shape - не имеет реализации, нужен для наследования другими классами
abstract class Shape {
    // Абстрактный метод - должен быть переопреден в дочерних классах
    abstract fun area(): Double

    // Обычыный метод - может быть переопреден в дочерних классах
    open fun describe() {
        println("Эта фигура имеет площадь ${area()}")
    }
}

abstract class Example1

abstract class Example2

// Наследование абстрактного класса возможно только единожды
class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }

    override fun describe() {
        println("Этот прямоугольник имеет площадь ${area()}")
    }
}