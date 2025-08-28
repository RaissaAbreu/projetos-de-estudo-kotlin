fun bankaccount() {
    println("Welcome to your banking system.")
    println("What type of account wold you live to creat?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    print("Choose an option(1,2 or 3): ")
    val optionString = readLine() ?: ""

    val option: Int = optionString.toInt() // Tenta converter para Int, retorna null se falhar

    if (option == 1 || option == 2 || option == 3) { // Verifica se é 1 OU 2 OU 3
        println("The selected option is $option.")
    } else {
        println("Entrada inválida.")
    }

    when (option){
        1 -> debitaccount()
        2 -> creditaccount()
        3 -> checkaccount()
    }
    println("What operação do you want to do? ")
    println("1- Deposit")
    println("2- Withdrawal of Founds")
    println("3- Check the current")
    val operationString: String? = readLine()

    val operation: Int? = operationString?.toIntOrNull()
    when (operation){
        1 -> deposit()
        2 -> withdrawal()
        3 -> checkbalance()
    }




}

fun debitaccount(){
    println("You have created a debit account.")

}

fun creditaccount(){
    println("You have created a credit account.")

}

fun checkaccount(){
    println("You have created a checking account.")

}

fun deposit(){
    var accountbalance = (0..1000).random()
    println("The current balance is $accountbalance dollars")
    println("How many do you want deposit?")
    var moneyString: String? = readLine()
    var money: Int? = moneyString?.toIntOrNull()
    var newbalance = accountbalance + (money ?: 0)
    println("New the current balance is $newbalance dollars")

}
fun withdrawal(){
    var accountbalance = (0..1000).random()
    println("The current balance is $accountbalance dollars")
    println("How many do you want drawal?")
    var drawalString: String? = readLine()
    var drawal: Int? = drawalString?.toIntOrNull()
    var newbalance = accountbalance - (drawal ?: 0)
    println("New the current balance is $newbalance dollars")


}
fun checkbalance(){
    var accountbalance = (0..1000).random()
    println("The current balance is $accountbalance dollars")
}

fun main() {
    bankaccount()
}