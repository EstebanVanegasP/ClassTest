fun esPalindromo(cadena: String): Boolean {
    val cadenaLimpia = cadena
        .replace(Regex("[^A-Za-z0-9]"), "")
        .toLowerCase()


    return cadenaLimpia == cadenaLimpia.reversed()
}

fun main() {
    val texto = "A man, a plan, a canal, Panama!"
    println("¿Es palíndromo? ${esPalindromo(texto)}")
}
