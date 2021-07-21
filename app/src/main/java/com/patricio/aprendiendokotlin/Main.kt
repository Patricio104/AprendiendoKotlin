package com.patricio.aprendiendokotlin


fun main(){

    val a=3
    val b = 2
    //var max = a
    //if (a<b) max =b
    //println(max)

    /*var max: Int
    if (a > b){
        max =a
    }else{
        max= b
    }*/

    val max = if (a > b) a else b

    println(max)
}



