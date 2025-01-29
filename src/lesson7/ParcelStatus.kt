package lesson7

enum class ParcelStatus(val value: Int) {
    SKIPPED(100),
    READY_TO_SHIP(200),
    RECEIVED(300),
    UNKNOWN(-1);

    companion object {

    }
}