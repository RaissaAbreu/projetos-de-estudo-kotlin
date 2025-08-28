


fun compara_palavras(palavra1: String , palavra2: String): String{
    val tamanho = palavra2.length
    if (palavra1.length < tamanho){
        return "Não são iguais"
    }

    val comparacao = palavra1.substring(0,tamanho)
    if (palavra2==comparacao){
        return "São iguais"
    } else {
        return "Não são iguais"
    }


}


fun main(){
    val palavra1 = "love"
    val palavra2 = "love"
    println(compara_palavras(palavra1,palavra2))

    val palavra10 = "sad"
    val palavra20 = "sadness"
    println(compara_palavras(palavra10, palavra20))
}