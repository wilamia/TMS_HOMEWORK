package tasks_kotlin

fun main() {
    bankAccountCreating()
    creatingShape()
    sendNotificationToUser()
    creatingProducts()
}

/*Напиши класс BankAccount с приватными полями balance и accountNumber.
Требования:
• Добавь методы deposit(double amount) и withdraw(double amount).
• Убедись, что нельзя снять больше, чем есть на балансе.
• Добавь геттер для balance, но не позволяй менять его напрямую.
• В main() создай объект BankAccount и протестируй методы.
*/
fun bankAccountCreating() {
    val user: BankAccount = BankAccount(453.80, 16723)
    user.deposit(400.65)
    user.getBalance()
    user.withdraw(1000.0)
    user.withdraw(50.0)
    user.getBalance()
}

/*Реализуй классы Rectangle, Circle и Triangle, которые могут вычислять свою площадь.
Требования:
• Создай интерфейс Shape с методом double getArea().
• Реализуй Rectangle, Circle и Triangle, которые вычисляют свою площадь.
• В main() создай список фигур и выведи их площади.
*/
fun creatingShape() {
    val shapes: MutableList<Shape> = mutableListOf()

    shapes.add(Triangle(10.0, 12.0))
    shapes.add(Circle(10.0))
    shapes.add(Rectangle(10.0, 10.0))

    for (shape in shapes) {
        println(shape.getArea())
    }
}

/*Напиши интерфейс Notifier с методом sendNotification(), а затем создай классы EmailNotifier, SMSNotifier и PushNotifier,
которые отправляют уведомления разными способами.
Требования:
• Интерфейс Notifier должен объявлять метод void sendNotification(String message).
• Каждый тип уведомления (EmailNotifier, SMSNotifier, PushNotifier) должен реализовать этот метод.
• Создай класс NotificationService, который принимает Notifier через конструктор и использует его для отправки
уведомлений.
• В main() продемонстрируй работу с разными типами уведомлений.*/
fun sendNotificationToUser() {
     val emailNotification: NotificationService = NotificationService(EmailNotifier())
    val smsNotification: NotificationService = NotificationService(SMSNotifier())
    val pushNotification: NotificationService = NotificationService(PushNotifier())
    smsNotification.notifyUser("привет")
    emailNotification.notifyUser("привет")
    pushNotification.notifyUser("привет")
}

/*Создай систему товаров для интернет-магазина. Каждый товар должен уметь вычислять свою
цену с учетом скидки.
1. Интерфейс Product с методом double getFinalPrice().
2. Классы Electronics, Clothing и Food, которые реализуют этот интерфейс.
◦ Electronics (например, смартфон) имеет скидку 10%.
◦ Clothing (например, куртка) имеет скидку 15%.
◦ Food (например, хлеб) не имеет скидки.
3. В main() добавь товары в список и выведи их финальные цены.*/
fun creatingProducts() {
    val products: MutableList<Product> = mutableListOf()
    products.add(Electronics("Телефон", 12000.3))
    products.add(Clothing("Майка", 1000.3))
    products.add(Food("Лимон", 12000.3))

    for (product in products) {
        println("Название: ${product.getTitle()}, цена: ${product.getFinalPrice()}")
    }
}