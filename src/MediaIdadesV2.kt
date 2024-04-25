fun main() {
    val numPessoas = 7
    var somaIdade = 0
    val idades = mutableListOf<Int>()

    for (i in 1..numPessoas) {
        print("Digite a idade da pessoa $i: ")
        val idade = readLine()!!.toInt()
        somaIdade += idade
        idades.add(idade)
    }

    val mediaIdades = somaIdade.toDouble() / numPessoas.toDouble()
    val mediaFormatada = String.format("%.2f" , mediaIdades)

    println("A média das idades é de: $mediaFormatada")
    println("As idades digitadas são: $idades")
}