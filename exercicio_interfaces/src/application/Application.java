package application;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;
import services.UsaTaxService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = input.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        Date pickup = dateformat.parse(input.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        Date end = dateformat.parse(input.nextLine());
        System.out.print("Enter price per hour: ");
        Double pricePerHour = input.nextDouble();
        System.out.print("Enter price per day: ");
        Double pricePerDay = input.nextDouble();

        CarRental carRental = new CarRental(new Vehicle(model), pickup, end);
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("INVOICE: ");
        System.out.printf("Basic payment: %.2f\n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f\n", carRental.getInvoice().getTax());
        System.out.printf("Total payment: %.2f\n", carRental.getInvoice().totalPayment());
        input.close();
    }
}
