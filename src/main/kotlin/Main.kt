fun main(args: Array<String>) {
    println("introduce la hora")
    var hora = readLine()


    var horaEntera = try {
        hora?.toInt() ?: 0
    } catch (_: Exception) {
        0
    }

    println("introduce los minutos")
    var minutos = readLine()
    var minutosEntera = try {
        minutos?.toInt() ?: 0
    } catch (_: Exception) {
        0
    }
    println("introduce los segundos")
    var segundos = readLine()
    var segundosEntera = try {
        segundos?.toInt() ?: 0
    } catch (_: Exception) {
        0
    }
    if (minutosEntera == 0 && segundosEntera == 0) {
        var tiempo1 = Tempo(horaEntera)
        println(tiempo1)
    }
    if (segundosEntera == 0) {
        var tiempo2 = Tempo(horaEntera, minutosEntera)
        println(tiempo2)
    } else {
        var tiempo3 = Tempo(horaEntera, minutosEntera, segundosEntera)
        println(tiempo3)
    }


}

class Tiempo(var hora: Int, var minutos: Int = 0, var segundos: Int = 0) {

    override fun toString(): String {
        return "$hora H , $minutos Min, $segundos Seg"
    }
}