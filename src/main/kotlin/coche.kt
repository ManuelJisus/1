fun main(args: Array<String>) {
    var f1 = Coche2("BMW", "3443cvb", "M3", "negro", 300, 4, 289, 60, 0, 178)
    f1.encendercoche()
    f1.iniciarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    f1.acelerarcoche()
    println(f1)
    var f2 = Coche2("Mercedes", "3443hji", "M3", "negro", 222, 4, 160, 60, 0, 160)
    f2.encendercoche()
    f2.iniciarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    f2.acelerarcoche()
    println(f2)
}

class Coche2(marca: String) {
    var marca = ""
    var modelo: String = ""
    var velocidadMax = 0
    var color = "blank"
    var matricula = ""
    var puertas = 0
    var caballos = 0
    var tanque = 0
    var marchaActual = 0
    var gasolina = 0
    var incrementovelocidad = 0
    var decrementovelocidad = 5
    var velocidad = 0

    constructor(
        marca: String, matricula: String, modelo: String, color: String, velocidadMax: Int,
        puertas: Int, caballos: Int, tanque: Int, marchaActual: Int, gasolina: Int
    ) : this(marca) {
        this.marca = marca
        this.modelo = modelo
        this.velocidadMax = velocidadMax
        this.color = color
        this.matricula = matricula
        this.puertas = puertas
        this.caballos = caballos
        this.tanque = tanque
        this.marchaActual = marchaActual
        this.gasolina = gasolina

    }

    /* init {
         require(velocidadMax > 50 && velocidadMax < 250) { "La velocidad introducida no esta entre 50 y 250." }
         require(marca.trim().length > 0) { "Argumento nombre inválido." }
     }
 */
    var encendido: Boolean = false
    fun encendercoche(): Boolean {
        if (marchaActual == 0 && gasolina > 0) {
            encendido = true

        }
        return encendido
    }

    fun iniciarcoche(): Int {
        if (encendido == true) {
            marchaActual = 1
            acelerarcoche()
        }
        return marchaActual
    }


    fun acelerarcoche(): Int {


        if (gasolina > 0 && velocidad < velocidadMax) {

            when (velocidad) {
                in 0..42 -> marchaActual = 1
                in 42..80 -> marchaActual = 2
                in 81..120 -> marchaActual = 3
                in 121..160 -> marchaActual = 4
                in 162..210 -> marchaActual = 5
                in 211..275 -> marchaActual = 6
            }
            when (marchaActual) {

                1 -> incrementovelocidad = 5

                2 -> incrementovelocidad = 11

                3 -> incrementovelocidad = 17

                4 -> incrementovelocidad = 13

                5 -> incrementovelocidad = 21

                6 -> incrementovelocidad = 25

            }

            when (marchaActual) {
                1 -> gasolina = gasolina - 4
                1 -> incrementovelocidad = 5
                2 -> gasolina = gasolina - 3
                2 -> incrementovelocidad = 11
                3 -> gasolina = gasolina - 3
                3 -> incrementovelocidad = 17
                4 -> gasolina = gasolina - 2
                4 -> incrementovelocidad = 13
                5 -> gasolina = gasolina - 1
                5 -> incrementovelocidad = 21
                6 -> gasolina = gasolina - 2
                6 -> incrementovelocidad = 25

            }
            when (caballos) {
                in 1..75 -> incrementovelocidad = incrementovelocidad + 1
                in 76..130 -> incrementovelocidad = incrementovelocidad + 3
                in 131..170 -> incrementovelocidad = incrementovelocidad + 5
                in 171..220 -> incrementovelocidad = incrementovelocidad + 7
                in 220..300 -> incrementovelocidad = incrementovelocidad + 9
            }
        } else {
            println("El coche no tiene gasolina ")

        }
        velocidad = velocidad + incrementovelocidad
        return velocidad
        return gasolina
    }

    fun CambiaMarcha(marcha: Int): Int {
        marchaActual = marcha

        return marchaActual
    }

    fun Frenar(): Int {

        if (velocidad > 0) {
            velocidad = velocidad - 5
        } else {
            println("el coche esta sin velocidad")
        }
        return velocidad
    }

    override fun toString(): String {
        return " LA GASOLINA ES $gasolina LA MARCHA ACTUAL ES $marchaActual la velocidad es $velocidad"
    }


}
