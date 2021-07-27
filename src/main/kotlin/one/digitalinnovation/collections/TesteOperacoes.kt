package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------------")
    println("Maior salário: ${salarios.maxOrNull()}")//função para trazer maior salario
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }//para filtrar os salarios maior que 2500
    println("----------------")
    salariosMaiorQue2500.forEach{ println(it)}

    println("----------------")
    println(salarios.count{it in 2000.0..5000.0})// (... significa de 2000 a 5000)

    println("----------------")
    println(salarios.find {it == 2250.0})
    println(salarios.find {it == 250.0})

    println("----------------")
    println(salarios.any {it == 1000.0})//operador qualquer - retorna true or false
    println(salarios.any {it == 10.0})
}