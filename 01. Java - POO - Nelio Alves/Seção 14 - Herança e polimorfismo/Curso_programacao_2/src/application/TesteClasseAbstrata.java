package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TesteClasseAbstrata {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new SavingsAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10);
            System.out.printf("Updated Balance %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
