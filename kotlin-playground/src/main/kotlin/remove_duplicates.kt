

fun remove_duplicates(lista: MutableList<Int>): MutableList<Int>{

    if (lista.isEmpty()){
        return lista
    }
    var numero_unico = 1
    for (i in 1 until lista.size){
        if (lista[i] != lista[numero_unico - 1]){
            lista[numero_unico] = lista[i]
            numero_unico ++
        }
    }
    while (lista.size> numero_unico){
        lista.removeAt(lista.size-1)
    }
    return lista
}
fun remove_duplicates_any_order(lista: List<Int>): List<Int> {
    return lista.distinct() // Retorna uma nova lista sem duplicatas
}

fun main (){
    var lista = mutableListOf(1, 1, 1, 4, 5, 6, 6, 7, 7, 8, 8)
    //println(remove_duplicates_any_order(lista))
    println(remove_duplicates(lista))

    var lista2 = listOf(1, 1, 1, 4, 5, 6, 6, 7, 7, 8, 8)
    println(remove_duplicates_any_order(lista2))


}