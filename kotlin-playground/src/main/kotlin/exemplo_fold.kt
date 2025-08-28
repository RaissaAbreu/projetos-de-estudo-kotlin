fun main(){
    val list = listOf(9, 3, 1, 6)
    val output = list.fold(1) { x, y ->
        x + y
    }
    println(output)




}

