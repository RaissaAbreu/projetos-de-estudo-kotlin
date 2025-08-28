fun intercala_lowe_upper(word:String): String{
    var pos = 0
    var stringfixa = ""
    var wordLower = word.lowercase()
    var wordUpper = word.uppercase()
    while (pos < word.length){
        if (pos % 2 == 0){
            stringfixa = stringfixa+wordUpper[pos]
        } else {
            stringfixa = stringfixa+wordLower[pos]
        }
        pos +=1
    }
    return stringfixa
}

fun main (){
    var word = "raissa"
    println(intercala_lowe_upper(word))
}