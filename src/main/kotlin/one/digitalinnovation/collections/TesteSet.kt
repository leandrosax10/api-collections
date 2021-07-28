package one.digitalinnovation.collections

fun main() {
    val Joao = funcionario("Joao", 3000.0, "CLT")
    val Pedro = funcionario("Pedro", 200.0, "CLT")
    val Alisson = funcionario("Alisson", 800.0, "PJ")

    val funcionarios1 = setOf(Joao, Pedro)
    val funcionarios2 = setOf(Alisson)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("------------------------------------")
    //subtract retira o que tem de comum entre os conjuntos
    val funcionarios3 =  setOf(Joao, Pedro, Alisson)
    val resultSubtract = funcionarios1.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    //intersect faz a intersecao entre os conjuntos
    println("------------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}