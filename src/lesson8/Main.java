package lesson8;

public class Main {

    public static void main(String[] args) {
        Payment[] array = new Payment[2];
        CreditCardPayment creditPayment = new CreditCardPayment(300, "$");
        PayPalPayment payPalPayment = new PayPalPayment(500, "BYN");
        array[0] = creditPayment;
        array[1] = payPalPayment;
        for (Payment payment : array) {
            payment.processPayment();
        }
    }
}

