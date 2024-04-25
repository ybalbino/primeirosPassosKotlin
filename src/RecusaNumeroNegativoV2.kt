fun main () {
    var soma = 0
    println("Digite uma sequência de números para calcular a soma. ")
    println("Digite um numero negativo e o programa será encerrado.")

    for (i in 1..Int.MAX_VALUE) {
        print("Digite um número: ")
        val num = readLine()!!.toInt()

        if (num < 0) {
            break
        }

        soma += num
    }

    println("A soma dos números digitados é: $soma")
}