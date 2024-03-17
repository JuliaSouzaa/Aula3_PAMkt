package lambdas

fun main (args: Array<String>) {

    println("Digite o primeiro número: ")
    val X = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X, Y)

    println("O resultado da soma é: = $resultado")
}

fun multiplica(x: Int, y: Int): Any {
    return x * y
}
