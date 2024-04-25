fun main () {
    val num: Int = 5
    val resultado: Int

    if (num % 2 == 0) {
        resultado = num + 5
        println("Resultado para um numero par: $resultado")
    } else {
        resultado = num + 8
        println("Resultado para um numero impar: $resultado")
    }
}