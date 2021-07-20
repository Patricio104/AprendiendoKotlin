package com.patricio.aprendiendokotlin

fun main(){

    //Kotlin
    //var es untipo de dato que se puede reaignar su valor en cualquier momento
    //var a:Int =2
    //var b:Int =3
    //var c:Int =a+b
    //println(c)

    //val a:Int =2
    //val b:Int =3
    //val c:Int =a+b
    //println(c)
    //val es de tipo inmutable, significa que no cambiará su valor en el transcurso, no podrá ser reasignado

    //Creación del objeto persona de la clase Persona y llamada a su método publico
    val persona: Persona = Persona("Patricio", "Juárez")
    persona.darBienvenida()
    //Creación del objetos persona2 sin mandarle los parametros en el constructor, solo accediendo a
    //los atributos de la clase importante que sean de tipo publico y de var
    val persona2 = Persona();
    persona2.nombre="Patricio"
    persona2.apellido="Juárez"
}
//Creación de la clase persona
/*class  Persona(
    val nombre: String,
    val apellido: String){
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }
}*/

//Con constructor vacío
class  Persona(
    //Los atributo se le asigna un valor vacío dependiento de que tipo sea y el modificador de
    // acceso tiene que ser public para que se puedan reasignar sus valores y que sean de tipo var
    var nombre: String = "",
    var apellido: String = ""){
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }
}