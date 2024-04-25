fun main() {

    var soma = 0
    var continuar = true
    println("Digite uma sequência de números para calcular a soma. ")
    println("Digite um numero negativo e o programa será encerrado.")

    while (continuar) {
        print("Digite um número: ")
        val numero = readLine()!!.toInt()

        if (numero < 0) {
            continuar = false
        } else {
            soma += numero
        }

    }

    println("A soma dos números digitados é: $soma")
}