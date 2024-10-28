package org.example

import org.example.classes.Person

// Новый модуль
fun main() {
    println("Hello World!")
    // К обращению из класса Person доступно только свойство id
    val person = Person()
    person.id
}