package com.bluaxl.fundamentoskotlin.Reto2

class RetoII {
}
class Album(private val Nalbum: String, private val Galbum: String) {

    class Song(val title: String, val artist: String, val year: Int, val reproducciones: Int)
    private val canciones: MutableList<Song> = mutableListOf()

    fun cancion(titulo: String, artista: String, ano: Int, reproducciones: Int) {
        canciones.add(Song(titulo, artista, ano, reproducciones))
    }

    fun CantidadCanciones(): Int {
        return canciones.size
    }

    fun CantidadReproducciones(): Int {
        return canciones.sumBy { it.reproducciones }
    }

    fun CancionPopular(): Song? {
        return canciones.maxByOrNull { it.reproducciones }
    }

    fun detalles() {
        println("Álbum: $Nalbum\nTipo de música: $Galbum\nNúmero de canciones: ${CantidadCanciones()}\nTotal de reproducciones del álbum: ${CantidadReproducciones()}")

        val cancionPopular = CancionPopular()
        if (cancionPopular != null) {
            println("Canción más popular: ${cancionPopular.title}, interpretada por ${cancionPopular.artist}")
            if (cancionPopular.reproducciones >= 1000) {
                println("Esta canción es muy popular.")
            } else {
                println("Esta canción es poco popular.")
            }
        } else {
            println("No hay canciones en el álbum.")
        }
    }

    fun detallesCancion() {
        for (song in canciones) {
            println("${song.title}, interpretada por ${song.artist}, se lanzó en ${song.year}, ${song.reproducciones} reproducciones.")
        }
    }
}

fun main() {
    println("digite el nombre del álbum")
    var nAlbum:String = readln()
    println("genero del álbum")
    var gAlbum = readln()
    val miAlbum = Album(nAlbum ,gAlbum)

    do {
        println("ingrese el nombre de la Canción")
        var nombre = readln()
        println("ingrese el nombre del Artista")
        var nombreArtista = readln()
        println("ingrese el año")
        var ano = readln().toInt()
        println("ingrese la cantidad de reproducciones")
        var reproducciones = readln().toInt()
        miAlbum.cancion(nombre,nombreArtista,ano,reproducciones)
        println("¿desea ingresar otra cancion?\nsi\nno")
        var opc = readln().toLowerCase()
    }
    while (opc=="si")
    miAlbum.detalles()
    miAlbum.detallesCancion()
}
