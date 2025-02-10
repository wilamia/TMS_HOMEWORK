package lesson7.kotlin_tasks

enum class ParcelStatus(val value: Int) {
    SKIPPED(100),
    READY_TO_SHIP(200),
    RECEIVED(300),
    UNKNOWN(-1);

    companion object {

    }
}