package com.stephen

fun main(args: Array<String>) {
//    println("Hello kotlin!!!")
//    Human().hello()
    val h = Human()
    h.hello()
    var age = 19
    age = 20
    var weight = 57.8f
//    val name = "Stephen"
    var name : String
    name = "Stephen"
}
class Human {
    fun hello() {
        println("Hello kotlin")
    }
}