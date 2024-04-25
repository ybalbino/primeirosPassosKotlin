fun main () {

    val numeros = Array<Int>(7) { 0 }

    repeat(7) { index ->
        print("Digite o número ${index + 1}: ")
        numeros[index] = readLine()!!.toInt()
    }

    var quantidadeEntre0e100 = 0

    for (numero in numeros) {
        if (numero in 0..100) {
            quantidadeEntre0e100++
        }
    }

    println("Quantidade de números entre 0 e 100: $quantidadeEntre0e100")
}