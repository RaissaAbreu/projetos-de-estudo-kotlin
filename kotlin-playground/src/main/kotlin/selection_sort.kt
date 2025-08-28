
fun selection_sort(list : MutableList<Int>): MutableList<Int>{
    var end = list.size
    for (i in 0 until end - 1){
        var position_minimo = i
        for (j in (i + 1) until end){
            if (list[j] < list[position_minimo]){
                position_minimo = j
            }
        }
        val temp = list[i]
        list[i] = list[position_minimo]
        list[position_minimo] = temp

    }
    return list

}

fun main(){
    var lista = mutableListOf(7,5,3,2,1,8)
    println(selection_sort(lista))
}