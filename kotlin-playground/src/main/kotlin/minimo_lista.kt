fun minimo_lista(lista: List<Int>): Int{
    var minimo = lista[0]
    for (i in lista.indices){
        if (lista[i] < minimo){
            minimo = lista[i]
        }
    }
    return minimo
}

fun main (){
    var lista = listOf(7,5,3,2,1,8)
    println(minimo_lista(lista))
}