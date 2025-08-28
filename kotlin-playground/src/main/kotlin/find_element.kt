// procura o elemento na lista e retorna o indice

fun <T> find_element(list: List<T>, element: T): Int? {
    for (i in list.indices){
        if (list[i] == element){
            return i
        }
    }
    return null
}



fun main(){
    val numeros = listOf(1, 2, 3, 4)
    println(find_element(numeros, 3)) // Saída: 2

    val palavras = listOf("maçã", "banana", "uva")
    println(find_element(palavras, "banana")) // Saída: 1

    println(find_element(palavras, "abacaxi")) // Saída: null


}