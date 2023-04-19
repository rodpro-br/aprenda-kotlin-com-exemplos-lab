enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    fun inscritos(){
        for(user in inscritos){
            println(user.nome)
        }
    }
}

fun main() {
    val aula1 = ConteudoEducacional("Aula 1", 45)
    val aula2 = ConteudoEducacional("Aula 2", 180)
    val aula3 = ConteudoEducacional("Aula 3", 60)
    val aula4 = ConteudoEducacional("Aula 4", 120)
    val aula5 = ConteudoEducacional("Aula 5", 60)
    
    val conteudosKotlin = mutableListOf<ConteudoEducacional>()
    
    conteudosKotlin.add(aula1)
    conteudosKotlin.add(aula2)
    conteudosKotlin.add(aula3)
    conteudosKotlin.add(aula4)
    conteudosKotlin.add(aula5)
    
    
    val formacaoKotlin = Formacao("Formação: Kotlin", conteudosKotlin, Nivel.AVANCADO)
    
    //alunos
    val aluno1 = Usuario("Aluno 1", "aluno1@email.com")
    val aluno2 = Usuario("Aluno 2", "aluno2@email.com")
    val aluno3 = Usuario("Aluno 3", "aluno3@email.com")
    
    //matriculando alunos
    formacaoKotlin.matricular(aluno1)
    formacaoKotlin.matricular(aluno2)
    formacaoKotlin.matricular(aluno3)
    
    //lista de alunos
    println("Alunos inscritos Formação Kotlin")
    formacaoKotlin.inscritos()
    
}