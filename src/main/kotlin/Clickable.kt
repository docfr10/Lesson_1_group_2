package org.example

interface Clickable {
    fun click()
    fun showOff() = println("На меня нажали")
}

interface Focusable {
    fun focus()
    fun showOff() = println("На мне сфокусировали внимание")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("Кнопка нажата")
    }

    override fun focus() {
        println("На кнопку посмотрели")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}