package org.example.classes

// Класс Car
// Первичный конструктор класса
class Car(val brand: String, var name: String) {
    // Companion object - позволяет обращаться к свойствам и методам класса без создания объектов
    companion object {
        val wheel = 4
        fun checkWheel(): Int = wheel
    }

    // Блок init — Используется для выполнения блока кода при создании экземпляра класса
    init {
        println("$brand, $name")
    }

    // Свойства класса - Переменные внутри класса
    var color: String = "White"

    // Приватное свойство
    private var engine: Double = 1.6

    // Гетер - получение значения свойства
    fun getEngine(): Double = engine

    // Сетер - изменения значения свойства
    fun setEngine(engine: Double) {
        this.engine = engine
    }

    // Свойство с поздней инициализацией
    lateinit var doors: String

    // Вызовется после первого блока init
    init {
        doors = "5"
        println("$brand, $name, $color")
    }

    // Метод класса - функция внутри класса
    fun go() {
        println("Go")
    }
}