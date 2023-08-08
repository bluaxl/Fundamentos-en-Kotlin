package com.bluaxl.fundamentoskotlin.Reto4

class RetoIV {
}
class Plato(val nombre: String, val descripcion: String, val precio: Double)
fun main() {
    val entradas = mutableListOf<Plato>()
    val platosFuertes = mutableListOf<Plato>()
    val postres = mutableListOf<Plato>()
    val bebidas = mutableListOf<Plato>()

    var opcion: Int
    do {
        println("\nMenú:")
        println("1. Agregar plato")
        println("2. Mostrar platos")
        println("3. Buscar plato por código")
        println("4. Modificar plato")
        println("5. Eliminar plato")
        println("6. Salir")
        print("Ingrese una opción: ")
        opcion = readLine()?.toIntOrNull() ?: 6

        when (opcion) {
            1 -> {
                print("Ingrese el nombre del plato: ")
                val nombre = readLine() ?: ""
                print("Ingrese la descripción del plato: ")
                val descripcion = readLine() ?: ""
                print("Ingrese el precio del plato: ")
                val precio = readLine()?.toDoubleOrNull() ?: 0.0
                print("Ingrese la categoría del plato (entradas, platos fuertes, postres, bebidas): ")
                val categoria = readLine() ?: ""
                when (categoria) {
                    "entradas" -> entradas.add(Plato(nombre, descripcion, precio))
                    "platos fuertes" -> platosFuertes.add(Plato(nombre, descripcion, precio))
                    "postres" -> postres.add(Plato(nombre, descripcion, precio))
                    "bebidas" -> bebidas.add(Plato(nombre, descripcion, precio))
                    else -> println("Categoría inválida.")
                }
            }
            2 -> {
                println("Entradas:")
                for ((i, plato) in entradas.withIndex()) {
                    println("$i - $plato")
                }
                println("Platos Fuertes:")
                for ((i, plato) in platosFuertes.withIndex()) {
                    println("$i - $plato")
                }
                println("Postres:")
                for ((i, plato) in postres.withIndex()) {
                    println("$i - $plato")
                }
                println("Bebidas:")
                for ((i, plato) in bebidas.withIndex()) {
                    println("$i - $plato")
                }
            }
            3 -> {
                print("Ingrese la categoría del plato (entradas, platos fuertes, postres, bebidas): ")
                val categoria = readLine() ?: ""
                print("Ingrese el código del plato: ")
                val codigo = readLine()?.toIntOrNull() ?: -1
                val lista = when (categoria) {
                    "entradas" -> entradas
                    "platos fuertes" -> platosFuertes
                    "postres" -> postres
                    "bebidas" -> bebidas
                    else -> emptyList()
                }
                if (codigo in 0 until lista.size) {
                    println("Plato por código: ${lista[codigo]}")
                } else {
                    println("Plato no encontrado.")
                }
            }
            4 -> {
                print("Ingrese la categoría del plato a modificar (entradas, platos fuertes, postres, bebidas): ")
                val categoria = readLine() ?: ""
                print("Ingrese el código del plato a modificar: ")
                val codigo = readLine()?.toIntOrNull() ?: -1
                val lista = when (categoria) {
                    "entradas" -> entradas
                    "platos fuertes" -> platosFuertes
                    "postres" -> postres
                    "bebidas" -> bebidas
                    else -> emptyList()
                }.toMutableList()
                if (codigo in 0 until lista.size) {
                    print("Ingrese el nuevo nombre del plato: ")
                    val nuevoNombre = readLine() ?: ""
                    print("Ingrese la nueva descripción del plato: ")
                    val nuevaDescripcion = readLine() ?: ""
                    print("Ingrese el nuevo precio del plato: ")
                    val nuevoPrecio = readLine()?.toDoubleOrNull() ?: 0.0
                    lista[codigo] = Plato(nuevoNombre, nuevaDescripcion, nuevoPrecio)
                    println("Plato modificado.")
                } else {
                    println("Código inválido.")
                }
            }
            5 -> {
                print("Ingrese la categoría del plato a eliminar (entradas, platos fuertes, postres, bebidas): ")
                val categoria = readLine() ?: ""
                print("Ingrese el código del plato a eliminar: ")
                val codigo = readLine()?.toIntOrNull() ?: -1
                val lista = when (categoria) {
                    "entradas" -> entradas
                    "platos fuertes" -> platosFuertes
                    "postres" -> postres
                    "bebidas" -> bebidas
                    else -> mutableListOf() // Usar mutableListOf() en lugar de emptyList()
                }
                if (codigo in 0 until lista.size) {
                    lista.removeAt(codigo)
                    println("Plato eliminado.")
                } else {
                    println("Código inválido.")
                }
            }
            6 -> println("Saliendo del programa...")
            else -> println("Opción inválida.")
        }
    } while (opcion != 6)
}