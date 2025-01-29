package lesson7

fun main() {
    val account = BankAccount("12Ks", 1000.0)
    account.getAccount()
    BankAccount.getInstance(name = "kseniya")

    checkStatus(1000)
}

fun checkStatus(statusCode: Int) {
    val result = when (statusCode) {
        100 -> ParcelStatus.SKIPPED
        200 -> ParcelStatus.READY_TO_SHIP
        300 -> ParcelStatus.RECEIVED
        else -> ParcelStatus.UNKNOWN
    }
    println(result)
}