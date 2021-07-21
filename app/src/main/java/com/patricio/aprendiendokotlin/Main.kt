package com.patricio.aprendiendokotlin


fun main(){

    //Extension functions
    val nombre = "Patricio"
    println(nombre.toLowerCase())

    println("Remover primer caracter: ${nombre.removerPrimerYUltimoCaracter()}")

}

fun String.removerPrimerYUltimoCaracter(): String = this.substring(1, this.length-1)



