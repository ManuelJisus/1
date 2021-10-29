
fun main() {
    var miConjunto = ConjuntoLibros()
    var miLibro1 = Libro("Harry Potter 1", "J.K.R", 145, 8)
    var miLibro2 = Libro("Crepusculo", "Stephenie Meyer", 250, 7)
    miConjunto.añadirLibro(miLibro1)
    println(miConjunto.libros[0])

}

class Libro(
    var titulo: String,
    var autor: String,
    var numPaginas: Int,
    var calificacion: Int

) {



    override fun toString(): String {
        return " El titulo es: ;$titulo, el autor es: $autor, el numero de paginas es: $numPaginas, la calificacion es : $calificacion"
    }
}


class ConjuntoLibros() {
    var libros: MutableList<Libro> = ArrayList(4)
    fun añadirLibro(valor: Libro) {

        libros.add(valor)
    }







}