package tasks_kotlin

interface Notifier {
    fun sendNotification(message: String)
}
class NotificationService(
    private val notifier: Notifier
) {
    fun notifyUser(message: String) {
        notifier.sendNotification(message)
    }
}

class EmailNotifier: Notifier {
    override fun sendNotification(message: String) {
        println("Отправка по E-mail: $message")
    }
}

class SMSNotifier: Notifier {
    override fun sendNotification(message: String) {
        println("Отправка по SMS: $message")
    }
}

class PushNotifier: Notifier {
    override fun sendNotification(message: String) {
        println("Отправка Push-уведомления: $message")
    }
}