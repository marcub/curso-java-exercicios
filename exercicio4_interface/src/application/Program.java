package application;

import service.BrazilInterestService;
import service.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("Months: ");
        int months = input.nextInt();
        input.nextLine();

        InterestService InterestService = new BrazilInterestService(2.0);

        System.out.printf("Payment after %d months:\n", months);
        System.out.printf("%.2f", InterestService.payment(amount, months));

        input.close();
    }

}
