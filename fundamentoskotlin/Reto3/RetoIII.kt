package com.bluaxl.fundamentoskotlin.Reto3

class RetoIII {
}


fun main() {
    val objetos = arrayOf("vehiculo", "Reloj", "jarra")
    val precioBase = intArrayOf(100000,200000,10000000)
    val oferta = IntArray(3)

    for (i in oferta.indices){
        println("Subasta para ${objetos[i]}. Precio base: ${precioBase[i]}")
        println("ingrese su oferta")
        oferta[i] = readln().toInt()
        while (precioBase[i]>oferta[i] && oferta[i]!= 0){
            println("Su oferta tiene que ser superior al precio base, si no desea ofrecer mas del precio base digite 0")
            oferta[i] = readln().toInt()
        }
    }

    var posicion = -1
    var ofertaMayor = 0

    for (i in oferta.indices) {
        if (oferta[i] > ofertaMayor) {
            ofertaMayor = oferta[i]
            posicion = i
        }
    }

    if (posicion != -1) {
        println("El artículo ${objetos[posicion]} se vende por $ofertaMayor")
    } else {
        println("Ningún artículo fue ofertado. Los artículos se venden a la casa de subastas.")
    }
}

