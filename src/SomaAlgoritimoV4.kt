fun main () {
    val num: Int = 3
    val resultado: Int = calculoResultado(num)
    println("Resultado para o número $num: $resultado")

}

fun calculoResultado(num: Int): Int {
   return if (num % 2 == 0) {
        num + 5
    } else {
        num + 8
    }
}