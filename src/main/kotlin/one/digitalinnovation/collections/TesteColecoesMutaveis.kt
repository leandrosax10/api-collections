package one.digitalinnovation.collections

fun main() {
    val Joao = funcionario("Joao", 3000.0, "CLT")
    val Pedro = funcionario("Pedro", 200.0, "CLT")
    val Alisson = funcionario("Alisson", 800.0, "PJ")

    println("---------------------------------------------")
    val funcionarios = mutableListOf(Joao, Pedro)
    funcionarios.forEach{ println(it)}

    println("---------------------------------------------")
    funcionarios.add(Alisson)
    funcionarios.forEach{ println(it)}

    println("---------------------------------------------")
    funcionarios.remove(Joao)
    funcionarios.forEach{ println(it)}

    println("------------------SET-------------------------")
    val funcionariosSet = mutableSetOf(Joao)
   // funcionariosSet.forEach{ println(it)}

    funcionariosSet.add(Pedro)
    funcionariosSet.add(Alisson)
    funcionariosSet.forEach{ println(it)}

    println("---------------------------------------------")
    funcionariosSet.remove(Alisson)
    funcionariosSet.forEach{ println(it)}


}