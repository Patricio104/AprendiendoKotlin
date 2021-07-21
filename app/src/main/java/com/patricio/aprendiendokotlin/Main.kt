package com.patricio.aprendiendokotlin


fun main(){

    //while

    var i = 1
    while(i<=5){
        println("Valor $i")
                ++i
    }

    var sum = 0
    var input: String

    do{
        print("Ingresar un numero:")
        input = readLine()!!
        sum += input.toInt()
    }while (input != "0")

    println("Sum = $sum")

}



