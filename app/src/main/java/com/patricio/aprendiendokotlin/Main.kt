package com.patricio.aprendiendokotlin

fun main(){

    val usuario = User("Patricio", 28)
    val usuario2 = usuario.copy(edad=30)
    println(usuario2.toString())

    println("Son iguales ${usuario == usuario2}")
}

data class User( val nombre: String, val edad: Int)