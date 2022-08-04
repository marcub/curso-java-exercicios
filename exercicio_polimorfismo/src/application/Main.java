package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numEmployees = input.nextInt();
        input.nextLine();

        for (int i = 0; i<numEmployees; i++) {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? " );
            char choice = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = input.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            if (choice == 'n') {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            } else {
                System.out.print("Additional charge: ");
                double additionalCharge = input.nextDouble();
                Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee x : employees) {
            System.out.printf("%s - $ %.2f\n", x.getName(), x.payment());
        }
        input.close();
    }
}
