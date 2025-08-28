


fun encontraImpares(lista: List<Int>): MutableList<Int> {
    val listaImpares = mutableListOf<Int>()
    for (elemento in lista){
        if (elemento % 2 != 0){
            listaImpares.add(elemento)
        }
    }
    return listaImpares

}

fun encontraImparesSimplificado(lista: List<Int>): List<Int> {
    return lista.filter { it % 2 != 0 }
}


fun main (){
    val lista = listOf(1,2,3,4,5)
    println(encontraImpares(lista))

    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("\nUsando a função simplificada:")
    println("Números ímpares encontrados: ${encontraImparesSimplificado(numeros)}")

}