package lesson7

class BankAccount(
    private var account: String, // первичный конструктор
    private var balance: Double,

) {

    fun getAccount(): String {
        return account
    }

    fun getBalance(): Double {
        return balance
    }

    companion object { //вместо static
        fun test() {
            println("test")
        }

        fun getInstance(name: String): TestClass {
            return TestClass(name)
        }
    }

}