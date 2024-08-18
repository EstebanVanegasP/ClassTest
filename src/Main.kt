fun esPalindromo(cadena: String): Boolean {
    val cadenaLimpia = cadena
        .replace(Regex("[^A-Za-z0-9]"), "")
        .toLowerCase()


    return cadenaLimpia == cadenaLimpia.reversed()
}

fun main() {
    val texto = "Radar Seres"
    println("¿Es palíndromo? ${esPalindromo(texto)}")
}
