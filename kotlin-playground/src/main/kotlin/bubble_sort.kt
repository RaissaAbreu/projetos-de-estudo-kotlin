fun bubble_sort(lista : MutableList<Int>): List<Int> {
    val end = lista.size

    for (i in end - 1 downTo 1) {
        for (j in 0 until i) {
            if (lista[j] > lista[j + 1]) {
                val temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp

            }
        }

    }
    return lista
}

fun bolha(lista2: MutableList<Int>) = lista2.apply {
    for (i in lastIndex downTo 1) {
        for (j in 0 until i) {
            if (this[j] > this[j + 1]) {
                this[j] = this[j + 1].also { this[j + 1] = this[j] }
            }
        }
    }
}


fun main() {
    val lista = mutableListOf(10,3, 8, -10, 200, 17)
    println(bubble_sort(lista))

    val lista2 = mutableListOf(10, 3, 8, -10, 200, 17)
    println(bolha(lista2))
}