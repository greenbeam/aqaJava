package Classes;
/*
Задача 2: Класс для представления банковского счета
Описание:
Создайте класс BankAccount, который будет представлять банковский счет.
Класс должен содержать:
Поля:
Номер счета (accountNumber).
Баланс (balance).
Методы:
deposit(double amount): пополнение счета.
withdraw(double amount): снятие денег с проверкой на достаточность средств.
getBalance(): возвращает текущий баланс.
 */

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение счета на " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }

    // Метод для снятия денег с проверкой на достаточность средств
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Снятие " + amount + ". Новый баланс: " + balance);
            } else {
                System.out.println("Недостаточно средств для снятия " + amount + ". Текущий баланс: " + balance);
            }
        } else {
            System.out.println("Сумма снятия должна быть положительной.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        account.deposit(500.0);  // Пополнение счета
        account.withdraw(200.0);  // Снятие денег
        account.withdraw(1500.0); // Попытка снять больше, чем на счете
        System.out.println("Конечный баланс: " + account.getBalance());
    }
}
