class BankAccount(
    val accountNumber: String,
    var balance: Double,
    val ownerName: String
) {
    fun deposit(amount: Double){
        if(amount > 0) {
            balance += amount
            println("$amount deposited successfully. New balance: $balance")
        } else {
            println("Invalid deposit amount. Amount must be greater than zero.")
        }
    }
}

fun main(){

    val myAccount  = BankAccount("123456789", 1000.0,"John Doe")


    myAccount.deposit(500.0)// Depositing 500.0
}