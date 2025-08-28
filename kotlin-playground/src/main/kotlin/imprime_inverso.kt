

fun impime_inverso(word:String) {
    var inverso = (word.length)-1
    while (inverso >= 0){
        print(word[inverso])
        inverso -= 1
    }
}

fun main (){
    var word = "raissa"
    impime_inverso(word)
}