fun selecao_direta(list: MutableList<Int>): List<Int>{
    val end =list.size
    for (i in 0 until list.size){
        var posicao_minimo = i
        for (j in i + 1 until end) {
            if (list[j] < list[posicao_minimo]) {
                posicao_minimo = j
            }
        }

        val temp = list[i]  //cria uma variavel temporaria para guardar o elemento
        list[i] = list[posicao_minimo]
        list[posicao_minimo] = temp


    }
    return list
}



fun main (){
    var list = mutableListOf(10,3,4,8,1,2,9,8)
    println(selecao_direta(list))
}