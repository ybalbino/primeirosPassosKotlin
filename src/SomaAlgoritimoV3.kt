fun main () {
    val num: Int = 2
    val resultado: Int

    if (num % 2 == 0) {
        resultado = num + 5
    } else {
        resultado = num + 8
    }

    println("Resultado para o numero $num: $resultado")
}