package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter account holder: ");
        String clientName = input.nextLine();

        System.out.print("Is there an initial deposit? (y/n) ");
        char response = input.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: $ ");
            double initialDeposit = input.nextDouble();
            account = new Account(accountNumber, clientName, initialDeposit);
        } else {
            account = new Account(accountNumber, clientName);
        }

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double depositBalance = input.nextDouble();
        account.depositBalance(depositBalance);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdrawal value: ");
        double withdrawalBalance = input.nextDouble();
        account.withdrawalBalance(withdrawalBalance);

        System.out.println("Updated account data: ");
        System.out.println(account);

        input.close();
    }
}
