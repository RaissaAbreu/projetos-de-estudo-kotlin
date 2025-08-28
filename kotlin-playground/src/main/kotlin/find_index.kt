fun find_index (word: String, letter: String): Int{
    var index = 0
    while (index < word.length){
        if (word[index] == letter[0]){
            return index
        }
        index += 1
    }
    return -1
}

fun main (){
    val word = "raissa"
    val letter = "i"
    println(find_index(word,letter))
}