package com.patricio.aprendiendokotlin

const val direccion = "24 de Abril"
fun main(){
    println(direccion)
    println(Constantes.direccion)

}

class Constantes {
    companion object{
        const val direccion = "25 de Abril"
    }
}
