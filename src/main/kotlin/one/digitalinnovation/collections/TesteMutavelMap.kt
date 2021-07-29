package one.digitalinnovation.collections

fun main() {
    val Joao = funcionario("Joao", 3000.0, "CLT")
    val Pedro = funcionario("Pedro", 200.0, "CLT")
    val Alisson = funcionario("Alisson", 800.0, "PJ")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Alisson.nome, Alisson)

    println(repositorio.findById(Joao.nome))

    println("------------------------------------")
    repositorio.findAll().forEach{ println(it)}

    println("------------------------------------")
    repositorio.remove(Alisson.nome)
    repositorio.findAll().forEach{ println(it)}

}