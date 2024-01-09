package ru.netology

fun main() {
   val amount = 50000
    val commission= amount * 75 /10000f
    val result = if(commission<35) amount-35 else amount-commission

    println("Комиссия составит: $result Рублей" )
}