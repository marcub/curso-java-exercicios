package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = dateFormat.parse(input.nextLine());
        System.out.print("Contract value: ");
        double value = input.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Enter de number of installments: ");
        int months = input.nextInt();
        input.nextLine();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        System.out.println("Installments: ");
        for (Installment e : contract.getInstallmentList()) {
            System.out.println(e);
        }



        input.close();
    }
}
