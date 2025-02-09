package tasks_java;

public enum Month {
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

    public String value;

    Month(String month) {
        this.value = month;
    }

    public void isWinter(String month) {
        if (month.toUpperCase().equals(Month.DECEMBER.name()) ||
                month.toUpperCase().equals(Month.JANUARY.name()) ||
                month.toUpperCase().equals(Month.FEBRUARY.name()) ||
                month.toLowerCase().equals(Month.DECEMBER.value) ||
                month.toLowerCase().equals(Month.JANUARY.value) ||
                month.toLowerCase().equals(Month.FEBRUARY.value)) {
            System.out.println("Это зимний месяц");
        } else {
            System.out.println("Это не зимний месяц");
        }
    }
}
