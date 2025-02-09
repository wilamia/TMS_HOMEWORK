package tasks_kotlin

enum class Role(
    private val privilege: Int
) {
    ADMIN(1),
    MODERATOR(0),
    USER(-1);

    fun hasSamePrivilege(other: Role): String {
        if (this.privilege == other.privilege)
            return "Привилегии равны"
        else if (this.privilege > other.privilege)
            return "Первая привилегия приоритетнее"
        else
            return "Вторая привилегия приоритетнее"
    }

}