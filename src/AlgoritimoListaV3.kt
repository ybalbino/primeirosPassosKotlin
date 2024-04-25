fun main() {

    val numeros = sequence<Int> {
        repeat(7) {
            print("Digite o número ${it + 1} : ")
            val num = readLine()!!.toInt()
            yield(num)
        }
    }

    val quantidadeEntre0e100 = numeros.count { it in 0..100 }
    println("Quantidade de números entre 0 e 100: $quantidadeEntre0e100")
}