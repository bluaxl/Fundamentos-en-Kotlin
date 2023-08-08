package com.bluaxl.fundamentoskotlin.Reto1

class RetoI {
}

fun main() {

    var Telefono: MutableList<Int> = mutableListOf()
    println("¿cual ese el mensaje de las notificaciones que recibiste?")
    var mensaje = readln().toLowerCase()
    println("cuantas notificaciones tendra el primer telefono")
    var t1:Int=readln().toInt()
    Telefono.add(t1)
    println("cuantas notificaciones tendra el segundo telefono")
    var t2:Int=readln().toInt()
    Telefono.add(t2)
    println("cuantas notificaciones tendra el tercero telefono")
    var t3:Int=readln().toInt()
    Telefono.add(t3)
    println("cuantas notificaciones tendra el cuarto telefono")
    var t4:Int=readln().toInt()
    Telefono.add(t4)

    for (i in Telefono.indices){
        if (Telefono[i]==0){
            println("el ${i+1} telefono no tienes notificaciones")
        }
        else if (Telefono[i]<100) {
            println("El ${i+1} telefono $mensaje ${Telefono[i]} ")
        }
        else if(Telefono[i]>=100){
            println("El ${i+1} telefono $mensaje 99+")
        }
        else{
            println("Error")
        }
    }






}