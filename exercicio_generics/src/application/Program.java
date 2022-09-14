package application;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int values = input.nextInt();
        input.nextLine();

        for (int i = 0; i<values; i++) {
            printService.addValue(input.nextInt());
            input.nextLine();
        }

        printService.print();
        System.out.print("\nFirst: " + printService.first());




        input.close();
    }
}
