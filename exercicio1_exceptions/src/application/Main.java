package application;

import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = input.nextInt();
            input.nextLine();
            System.out.print("Holder: ");
            String holder = input.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = input.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = input.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);
            System.out.print("\nEnter amount for withdraw: ");
            double amount = input.nextDouble();
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());
            input.close();
        } catch (InsufficientBalanceException | WithdrawLimitExceededException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.print("Unexpected error!");
        }
    }
}
