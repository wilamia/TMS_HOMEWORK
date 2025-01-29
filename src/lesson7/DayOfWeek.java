package lesson7;

public enum DayOfWeek {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");

    public String value;

    DayOfWeek(String value) {
        this.value = value;
    }
}
