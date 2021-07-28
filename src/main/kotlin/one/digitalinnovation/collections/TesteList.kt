package one.digitalinnovation.collections

fun main() {
    val Joao = funcionario("Joao", 3000.0, "CLT")
    val Pedro = funcionario("Pedro", 200.0, "CLT")
    val Alisson = funcionario("Alisson", 800.0, "PJ")

    val funcionarios = listOf(Joao, Pedro, Alisson)

    funcionarios.forEach { println(it)}
    println("------------------------------------")
    //find para imprimir o funcionario especifico
    println(funcionarios.find { it.nome=="Pedro" })

    println("------------------------------------")
    //SortedBy ordena por tamanho
    funcionarios.sortedBy { it.salario }.forEach {println(it)}

    println("------------------------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach {println(it)}

}

data class funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """"
             Nome: $nome
             Salário: $salario
        """.trimIndent()
}