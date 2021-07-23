package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }
    println("--------Ordenado---------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------------")
    val nomes2 = arrayOf("Maria", "Pedro", "Zazá")
    nomes2.sort()
    nomes2.forEach { println(it) }
}