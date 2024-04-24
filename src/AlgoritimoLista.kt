fun main(){

    val numeros = mutableListOf<Int>()

    repeat(7){
        print("Digite o número ${it + 1}: ")
        val numero = readLine()!!.toInt()
        numeros.add(numero)
    }

    var quantidadeEntre0e100 = 0

    for (numero in numeros){
        if (numero in 0..100){
            quantidadeEntre0e100++
        }
    }

    println("Quantidade de números entre 0 e 100: $quantidadeEntre0e100")
}
