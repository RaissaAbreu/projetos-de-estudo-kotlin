fun main(){
    val numeros = listOf(1, 2, 3, 4, 5)

    numeros.forEach {
        println("Dobro de $it é ${it * 2}")
    }

    var sum = 0
    val numberList = listOf(2, 8, 3, 11)
    numberList.forEach { number ->
        sum += number
    }
    println(sum)
}

