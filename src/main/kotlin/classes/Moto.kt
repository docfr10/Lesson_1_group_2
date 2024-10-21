package org.example.classes

class Moto {
    var brand: String
    var name: String

    // Вторичный конструктор
    constructor(brand: String, name: String) {
        this.brand = brand
        this.name = name
    }

    override fun toString(): String {
        return "$brand, $name"
    }
}