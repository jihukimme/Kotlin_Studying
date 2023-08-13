package com.example.practice

class data {
}

data class Ticket(val companyName: String, val name: String, var date: String, val seatNumber: Int)
//toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main(){
    val ticketA = Ticket("koreanAir", "Jihu", "20.19.2", 14)
    val ticketB = TicketNormal("koreanAir", "Jihu", "20.19.2", 14)

    println(ticketA)
    println(ticketB)
}