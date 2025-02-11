package tasks_kotlin

class BankAccount (
    private var balance: Double,
    private val accountNumber: Int
) {
    fun getBalance() {
        val balance = String.format("%.2f", balance)
        println("Баланс на счете: $balance")
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (balance-amount>=0 && amount > 0) {
            balance-=amount
        } else {
            println("Недостаточно денег на счете!");
        }
    }
}