package com.example.practice

class classPractice {
}

open class Human(val name: String = "Anonymous"){

    constructor(name: String, age: Int): this(name){
        println("my name is ${name}, ${age}years old")
    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so yummy")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("랄랄랄")
        println("my name is :${name}")
    }
}

fun main(){
    val human = Human("jihu")

    val stranger = Human()

    human.eatingCake()

    val mom = Human("kuri", 22)

    println("this human's name is ${human.name}")

    val korean = Korean()
    korean.singASong()

}