package com.bluaxl.fundamentoskotlin.Reto5

class RetoV {
}
fun main() {
    val clave=4682
    val num: Long =3214012452
    var saldo:Int=4500
    var intentos=3
    var respuesta=""

    while(intentos>0){
        println("Bienvendo a la aplicación Nequi Colombia")
        println("Por favor ingrese el telefono")
        var telefono= readLine()!!.toLong()
        println("Por favor ingrese la clave")
        var codigo=readLine()!!.toInt()
        if(clave == codigo && num.toLong() == telefono) {
            do {
                println("Has ingresado al sistema")
                println("Su saldo es: $saldo")
                println("¿Qué función desea realizar?\n1.Retirar\n2.Enviar\n3.Recargar\n4.Salir")
                var opcion = readln()!!.toInt()
                if (opcion == 1) {
                    println("Elija una opcioón\n1.Cajero\n2.Punto físico")
                    var opcion1 = readLine()!!.toInt()
                    if ((opcion1 == 1 || opcion1 == 2) && saldo > 2000) {
                        println("¿Cuánto desea retirar?")
                        var retiro = readln()!!.toInt()
                        saldo = saldo - retiro
                        println("Su código es ${(1000..9999).random()}")
                        println("¿Desea volver al menú? \nsi\nno")
                        respuesta = readln().toString().lowercase()
                    }
                } else if (opcion == 2) {
                    println("Por favor ingrese el número al cual desea enviar el dinero")
                    var telefono2 = readLine()!!.toLong()
                    println("Ingrese el valor que desea enviar")
                    var enviar = readLine()!!.toInt()
                    if (enviar > saldo) {
                        println("No cuenta con el dinero suficiente, su saldo es:${saldo}")
                    } else {
                        println("Proceso realizado")
                        saldo = saldo - enviar
                        println("¿Desea volver al menú?")
                        respuesta = readln().toString().lowercase()


                    }
                } else if (opcion == 3) {
                    println("Ingrese el valor a recargar")
                    var recarga = readLine()!!.toInt()
                    println("¿Seguro que desea realizar una recarga del valor ${recarga}?")
                    var resp = readLine().toString().lowercase()
                    if (resp == "si") {
                        println("Recarga realizada con éxito")
                        saldo = saldo + recarga
                        println("¿Desea volver al menú?")
                        respuesta = readln().toString().lowercase()
                    }
                    else{
                        println("Proceso rechazado")
                        println("¿Desea volver al menú?")
                        respuesta = readln().toString().lowercase()
                    }

                } else if (opcion == 4) {
                    println("saliendo de la aplicacion")
                    return
                }
            }while (respuesta=="si")
        }
        else {
            println("datos son incorrectos, Tienes ${intentos} intentos más")
            intentos--
        }

    }
}