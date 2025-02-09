package tasks_java;

public enum Role {
    ADMIN("полный доступ"),
    MODERATOR("частичный доступ"),
    USER("ограниченный доступ");

    private String privileges;

    Role(String privileges) {
        this.privileges = privileges;
    }

    public String getPrivileges() {
        return this.privileges;
    }

}
