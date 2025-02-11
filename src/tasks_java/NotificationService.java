package tasks_java;

interface Notifier {
    void sendNotification(String message);
}

class NotificationService {
    Notifier notifier;

    NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    void notifyUser(String message) {
       notifier.sendNotification(message);
    }
}

class EmailNotifier implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправка по E-mail: " + message);
    }
}

class SMSNotifier  implements Notifier {
    @Override
    public void sendNotification(String message) {
        System.out.println("Отправка по SMS: " + message);
    }
}

class PushNotifier  implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Отправка Push-уведомления: " + message);
    }
}
