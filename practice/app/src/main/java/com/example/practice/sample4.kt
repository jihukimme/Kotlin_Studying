package com.example.practice


//Singleton Pattern
object CarFactory{
    val cars: MutableList<Car> = mutableListOf<Car>()
    fun makeCar(hoursePower: Int): Car{
        val car = Car(hoursePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)

fun main(){
    val car: Car = CarFactory.makeCar(10)
    val car2: Car = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}