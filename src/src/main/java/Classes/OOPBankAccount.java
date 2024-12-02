package Classes;
/*
Задача 8: Банковский счет и принципы ООП
Описание:
Создайте приложение для управления банковскими счетами, которое включает следующие классы:
Абстрактный класс BankAccount:
Поля: accountNumber (номер счета), balance (баланс).
Методы:
Абстрактный метод calculateInterest().
Реализация метода deposit(double amount) для пополнения счета.
Реализация метода withdraw(double amount) с проверкой на достаточность средств.
Класс SavingsAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
Класс CheckingAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest() без начисления процентов.
Инкапсуляция:
Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
Полиморфизм:
Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.


abstract class OOPBankAccount {
    private String accountNumber;
    private double balance;

    public OOPBankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Начальный баланс 0
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнено: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть положительной.");
        }
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + ". Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств или неверная сумма.");
        }
    }

    // Абстрактный метод для расчета процентов
    public abstract void calculateInterest();
}
// Класс SavingsAccount, наследующий от BankAccount
    class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // 5% годовых

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest); // Добавляем проценты к балансу
        System.out.println("Начислены проценты: " + interest + ". Новый баланс: " + getBalance());
    }
}

// Класс CheckingAccount, наследующий от BankAccount
    class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        // Для CheckingAccount проценты не начисляются
        System.out.println("Проценты не начисляются для CheckingAccount.");
    }

    public class BankApplication {
        public static void main(String[] args) {
            // Создаем массив банковских счетов
            OOPBankAccount[] accounts = new OOPBankAccount[2];

            // Создаем разные типы счетов
            accounts[0] = new SavingsAccount("SA12345");
            accounts[1] = new CheckingAccount("CA12345");

            // Пополняем и снимаем средства с каждого счета
            accounts[0].deposit(1000);
            accounts[0].withdraw(200);
            accounts[0].calculateInterest(); // Начисление процентов

            accounts[1].deposit(500);
            accounts[1].withdraw(100);
            accounts[1].calculateInterest(); // Проверка процентов

            // Вывод информации о счетах
            for (BankAccount account : accounts) {
                System.out.println("Номер счета: " + account.getAccountNumber() + ", Баланс: " + account.getBalance());
            }
        }

*/
