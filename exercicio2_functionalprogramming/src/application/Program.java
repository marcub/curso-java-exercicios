package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String filePath = input.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<Employee> employeeList = new ArrayList<>();
            String lineContent = reader.readLine();
            while(lineContent != null) {
                String[] lineContentSeparated = lineContent.split(",");
                employeeList.add(new Employee(lineContentSeparated[0], lineContentSeparated[1], Double.parseDouble(lineContentSeparated[2])));
                lineContent = reader.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = input.nextDouble();
            input.nextLine();

            List<Employee> employeesAboveSalary = employeeList.stream()
                    .filter(x -> x.getSalary() > salary)
                    .sorted((x, y) -> x.getName().toUpperCase().compareTo(y.getName().toUpperCase()))
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than $ " + String.format("%.2f", salary) + ":");
            employeesAboveSalary.forEach(x -> System.out.println(x.getEmail()));

            List<Employee> employeesStartLetterM = employeeList.stream().filter(x -> x.getName().toUpperCase().charAt(0) == 'M').collect(Collectors.toList());
            double sumSalary = employeesStartLetterM.stream().map(x -> x.getSalary()).reduce(0.0, (x, y) -> x+y);

            System.out.print("Sum of salary of people whose name starts with 'M': $ " + String.format("%.2f", sumSalary));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
