package tasks_java;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    /*Напиши класс BankAccount с приватными полями balance и accountNumber.
Требования:
• Добавь методы deposit(double amount) и withdraw(double amount).
• Убедись, что нельзя снять больше, чем есть на балансе.
• Добавь геттер для balance, но не позволяй менять его напрямую.
• В main() создай объект BankAccount и протестируй методы.
*/
    public static void bankAccountTesting() {
        BankAccount user = new BankAccount(2000.98, 453216);
        user.getBalance();
        user.withdraw(2000);
        user.getBalance();
        user.withdraw(100);
        user.getBalance();
        user.deposit(200);
        user.getBalance();
    }

    /*Реализуй классы Rectangle, Circle и Triangle, которые могут вычислять свою площадь.
Требования:
• Создай интерфейс Shape с методом double getArea().
• Реализуй Rectangle, Circle и Triangle, которые вычисляют свою площадь.
• В main() создай список фигур и выведи их площади.
*/
    public static void createShape() {
        Shape rectangle = new Rectangle(100, 10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10, 10);
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
    }
/*Напиши интерфейс Notifier с методом sendNotification(), а затем создай классы EmailNotifier, SMSNotifier и PushNotifier,
которые отправляют уведомления разными способами.
Требования:
• Интерфейс Notifier должен объявлять метод void sendNotification(String message).
• Каждый тип уведомления (EmailNotifier, SMSNotifier, PushNotifier) должен реализовать этот метод.
• Создай класс NotificationService, который принимает Notifier через конструктор и использует его для отправки
уведомлений.
• В main() продемонстрируй работу с разными типами уведомлений.*/
    public static void sendNotificationToUser() {
        Notifier smsNotifier = new SMSNotifier();
        Notifier emailNotifier = new EmailNotifier();
        Notifier pushNotifier = new PushNotifier();
        NotificationService userSMS = new NotificationService(smsNotifier);
        NotificationService userEmail = new NotificationService(emailNotifier);
        NotificationService userPush = new NotificationService(pushNotifier);
        userSMS.notifyUser("привет");
        userEmail.notifyUser("привет");
        userPush.notifyUser("привет");
    }

    /*Создай систему товаров для интернет-магазина. Каждый товар должен уметь вычислять свою
цену с учетом скидки.
1. Интерфейс Product с методом double getFinalPrice().
2. Классы Electronics, Clothing и Food, которые реализуют этот интерфейс.
◦ Electronics (например, смартфон) имеет скидку 10%.
◦ Clothing (например, куртка) имеет скидку 15%.
◦ Food (например, хлеб) не имеет скидки.
3. В main() добавь товары в список и выведи их финальные цены.*/
    public static void creatingProducts() {
        Clothing tShirt = new Clothing("Футболка", 2312.23);
        Electronics phone = new Electronics("Телефон", 1200.67);
        Food lemon = new Food("Лимон", 12.5);

        List<Product> products = new java.util.ArrayList<>(List.of());
        products.add(tShirt);
        products.add(phone);
        products.add(lemon);

        for (Product product : products) {
            System.out.println("Название: " + product.getTitle() + ", цена: " + product.getFinalPrice());
        }
    }
}
