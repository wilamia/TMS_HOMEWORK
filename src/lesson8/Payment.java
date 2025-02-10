package lesson8;

abstract class Payment {
    public String currency;
    public int amount;
    Payment (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    abstract void processPayment();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    void processPayment() {
        System.out.println("Оплата картой. Сумма: " + amount + " Валюта: " + currency);
    }
}

class PayPalPayment extends Payment {
    PayPalPayment(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    void processPayment() {
        System.out.println("Оплата через PayPal. Сумма: " + amount + " Валюта: " + currency);
    }
}