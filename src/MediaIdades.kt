fun main(){
    var numPessoas = 5
    var somaIdade = 0

    for (i in 1..numPessoas){
        println("Digite a idade da pessoa $i: ")
        val idade = readLine()!!.toInt()
        somaIdade += idade
    }

    val mediaIdades = somaIdade.toDouble() / numPessoas.toDouble()
    println("A média das idades é de: $mediaIdades")
}