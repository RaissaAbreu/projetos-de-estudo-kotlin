

fun busca_binaria(list: List<Int>, element: Int): Int?{
    var primeiro = 0
    var ultimo = list.size-1

    while (primeiro <= ultimo ){
        val meio = (primeiro + ultimo)/2
        if (list[meio]==element){
            return meio
        } else{
            if (element < list[meio]){
               ultimo = meio - 1
            } else {
                primeiro = meio +1
            }
        }

    }

    return null


}


fun main(){
    var list = listOf(1, 2, 6, 20, 22, 35, 40, 67, 100, 8000)
    println(busca_binaria(list, 35))

}