//ordena uma lista

fun insertion_sort(list: MutableList<Int>): List<Int>{
    var size = list.size
    for (i in 1 until size){
        var chave = list[i]
        var j = i - 1
        while (j >= 0 && list[j] > chave){
            list[j+1]= list [j]
            j --
        }
        list [j+1] = chave
    }
    return list

}

fun main(){
    var list = mutableListOf(10,3,8,-10,200,17)
    println(insertion_sort(list))
}