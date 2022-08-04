package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("MM/yyyy");

        System.out.print("Enter department's name: ");
        String name = input.nextLine();
        Department department = new Department(name);
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Level: ");
        String level = input.nextLine();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);
        System.out.print("Base salary: $ ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, workerLevel, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int numContracts = input.nextInt();
        input.nextLine();

        for (int i = 0; i<numContracts; i++) {
            System.out.printf("Enter contract #%d data:\n", i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = format1.parse(input.nextLine());
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();
            input.nextLine();
            worker.addContract(new HourContract(contractDate, valuePerHour, hours));
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        Date incomeDate = format2.parse(input.nextLine());
        Calendar cal = Calendar.getInstance();
        cal.setTime(incomeDate);
        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %s: $ %.2f\n", format2.format(incomeDate), worker.income(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)));

        input.close();
    }
}
