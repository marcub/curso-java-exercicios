package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i<n; i++) {
            System.out.printf("\nEmployee #%d:\n", i+1);
            System.out.print("Id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            Employee employee = new Employee(id, name, salary);
            listEmployee.add(employee);
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int employeeIncrease = input.nextInt();
        if (hasId(listEmployee, employeeIncrease) == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            input.nextLine();
            for (Employee x : listEmployee) {
                if (x.getId() == employeeIncrease) {
                    x.salaryIncrease(percentage);
                }
            }
        }

        System.out.println("\nList of employees: ");
        for (Employee x : listEmployee) {
            System.out.println(x);
        }

        input.close();
    }

    public static Integer hasId(List<Employee> list, int employeeIncrease) {
        Integer id = null;
        for (Employee x : list) {
            if (x.getId() == employeeIncrease) {
                id = list.indexOf(x);
            }
        }
        return id;
    }

}
