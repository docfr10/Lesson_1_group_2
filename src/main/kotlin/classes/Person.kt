package org.example.classes

open class Person {
    // Модификаторы доступа - определяют где можно использовать класс, метод или свойство

    // Public - модификатор доступа по умолчанию, доступен везде
    public var id: Int = 0

    // Private - модификатор доступа, недоступно нигде кроме класса
    private var name: String = ""

    // Protected - модификатор доступа, доступно только в классе или подклассе
    protected var age: Int = 0

    // Internal - модификатор доступа, доступно только в рамках одного модуля
    internal var address: String = ""

    init {
        name = "New name"
    }
}

class Max : Person()