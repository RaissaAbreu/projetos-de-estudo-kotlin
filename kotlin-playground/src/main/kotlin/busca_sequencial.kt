

fun busca_sequencial(list: List<Int>, element: Int): Int? {
    for (i in list.indices){
        if (list[i] == element){
            return i
        }
    }
    return null
}


fun main(){
    var list = listOf(1, 2, 6, 20, 22, 35, 40, 67, 100, 8000)
    println(busca_sequencial(list, 35))

    println(busca_sequencial(list,40))
}