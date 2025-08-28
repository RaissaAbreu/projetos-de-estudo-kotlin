fun fizzbuzz(number: Int): String{
    if (number % 5 == 0 && number % 3 ==0){
        return "FizzBuzz"
    }
    if (number % 3 == 0  && number % 5 != 0){
       return ("Fizz")
    }
    if (number % 5 == 0 && number % 3 != 0){
        return ("Buzz")
    }
    else{
        return "number"
    }
}





fun main (){
    val number = 6
    println(fizzbuzz(number))
}