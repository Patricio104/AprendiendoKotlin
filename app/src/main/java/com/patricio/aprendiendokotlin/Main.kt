package com.patricio.aprendiendokotlin


fun main() {

    //Nullabilidad
    // ? indicar que puede ser nulo
    // !! asegurarse de que no es nulo (no recomendado)

    val nombre: String = "Patricio"
    println(nombre.length)

    //imprime null

    val nombre2: String? = null
    println(nombre2?.length)

    //Provoca el típico Exception in thread "main" java.lang.NullPointerException
    //val nombre3: String? = null
    //println(nombre3!!.length)


    //Cuando nuestra variable sea nulo se puede notificar retornando otro valor que no sea null
    val nombre4: String? = null
    val c = nombre4?.length ?: "Patrick".length
    println(c)

    //Usando let, solamente va entrar cuando nuestra variable no sea nula
    val nombre5: String? = "Patricio"
    nombre5?.let {
        println(it)
    }

}



