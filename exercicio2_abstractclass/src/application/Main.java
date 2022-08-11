package application;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numPayers = input.nextInt();
        input.nextLine();

        for (int i = 0; i<numPayers; i++) {
            System.out.printf("Tax payer #%d data:", i+1);
            System.out.print("Individual or company (i/c)? ");
            char personChoice = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Annual income: $ ");
            double annualIncome = input.nextDouble();
            if (personChoice == 'i') {
                System.out.print("Health expenditures: $ ");
                double healthSpending = input.nextDouble();
                Person person = new NaturalPerson(name, annualIncome, healthSpending);
                personList.add(person);
            } else {
                System.out.print("Number of employees: ");
                int numEmployees = input.nextInt();
                Person person = new LegalPerson(name, annualIncome, numEmployees);
                personList.add(person);
            }
        }

        System.out.println("\nTAXES PAID:");
        double sumTaxes = 0;
        for (Person x : personList) {
            System.out.printf("%s: $ %.2f\n", x.getName(), x.tax());
            sumTaxes += x.tax();
        }
        System.out.printf("\nTOTAL TAXES: $ %.2f", sumTaxes);

        input.close();
    }
}
