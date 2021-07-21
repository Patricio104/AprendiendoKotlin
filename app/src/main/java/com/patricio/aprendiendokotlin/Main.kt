package com.patricio.aprendiendokotlin


fun main(){

    //Lista mutable, pueder ser modificada
    var listaMutable = mutableListOf<String>("Patricio", "Gonzalo", "Benigno", "Santos")
    //Lista inmutable, no puede ser modificada
    var listaInmutable = listOf<String>("Bici", "Moto", "Auto")

    for (nombre in listaMutable){
        println(nombre)
    }


    for((index, value) in listaMutable.withIndex()){
        println("Nombre : $value con indice: $index")
    }

    listaInmutable.forEach { elementos ->
        println(elementos)
    }

    listaInmutable.forEachIndexed { index, elemento ->
        println("Elemento : $elemento con indice: $index")
    }

}



