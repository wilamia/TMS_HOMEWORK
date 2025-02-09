package tasks_kotlin

import java.util.*

enum class Month(val value: String) {
    JANUARY("январь"),
    FEBRUARY("февраль"),
    MARCH("март"),
    APRIL("апрель"),
    MAY("май"),
    JUNE("июнь"),
    JULY("июль"),
    AUGUST("август"),
    SEPTEMBER("сентябрь"),
    OCTOBER("октябрь"),
    NOVEMBER("ноябрь"),
    DECEMBER("декабрь");

    companion object {
        fun isWinter(month: String) {
            if (month.uppercase(Locale.getDefault()) == DECEMBER.name ||
                month.uppercase(Locale.getDefault()) == JANUARY.name ||
                month.uppercase(Locale.getDefault()) == FEBRUARY.name ||
                month.lowercase(Locale.getDefault()) == DECEMBER.value ||
                month.lowercase(Locale.getDefault()) == JANUARY.value ||
                month.lowercase(Locale.getDefault()) ==  FEBRUARY.value
            ) {
                println("Это зимний месяц")
            } else {
                println("Это не зимний месяц")
            }
        }
    }
}