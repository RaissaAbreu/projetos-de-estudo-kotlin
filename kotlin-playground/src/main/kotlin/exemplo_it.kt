fun main(){
    data class Car(
        val color: String,
        val amount: Int
    )
    val list = listOf(
        Car("Black", 43000),
        Car("Red", 30000),
        Car("White", 36000)
    )
    val output = list.map {
        it.color
    }


    println(output)
}