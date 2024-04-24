fun main() {
    var a: Int
    var b: Int
    var c: Int

    print("Digite um numero: ")
    a = readLine()!!.toInt()

    print("Digite um numero: ")
    b = readLine()!!.toInt()

    if (a == b){
        c = a + b
        println("A soma de a + b é: $c")
    } else{
        c = a * b
        println("A multiplicação de a * b é: $c")
    }
}