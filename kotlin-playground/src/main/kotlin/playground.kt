fun main(){
    val numberMap = mapOf(
        5 to 6,
        3 to 2,
        8 to 7,
        4 to 1
    )

    val output = numberMap.map { entry ->
        entry.value
    }.filter {
        it > 3
    }.fold(0) { x, y ->
        x + y
    }

    println(output)



}


