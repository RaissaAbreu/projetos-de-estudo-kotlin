fun somaElementos(lista: List<Int>): Int{
    var soma = 0
    for (elemento in lista){
        soma += elemento
    }
    return soma

}

fun main (){
    val lista = listOf(1,2,3,4,5)
    println(somaElementos(lista))
}
