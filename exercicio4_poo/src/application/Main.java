package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? US$ ");
        double dollarPrice = input.nextDouble();
        System.out.print("How many dollars will be bought? US$ ");
        double dollarAmount = input.nextDouble();

        System.out.printf("Amount to be paid in reais = R$ %.2f", CurrencyConverter.amountCalculator(dollarPrice, dollarAmount));

        input.close();

    }
}
