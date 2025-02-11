package tasks_java;

public class BankAccount {
    private double balance;
    private int accountNumber;

    BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void getBalance() {
        String balanceL = String.format("%.2f", balance);
        System.out.println("Баланс на счете: " + balanceL);
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    void withdraw(double amount) {
        if (balance - amount >= 0 && amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Недостаточно денег на счете!");
        }
    }
}
