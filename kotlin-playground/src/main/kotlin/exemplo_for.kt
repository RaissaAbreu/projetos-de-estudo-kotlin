fun main() {
    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    for (i in 5 downTo 1){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    for (i in 1..5) {
        val numberOfStar = 6 - i
        for (j in 1..numberOfStar) {
            print("*")
        }
        println()
    }
    val value = true
    println("$value || false")
    println(true && false)
    println (true || false)


}




