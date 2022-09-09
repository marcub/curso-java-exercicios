package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long pickupTime = carRental.getPickupTime().getTime();
        long returnTime = carRental.getReturnTime().getTime();
        double duration = (double) (returnTime - pickupTime) / (1000*60*60);
        if (duration <= 12) {
            int durationHours = (int) Math.ceil(duration);
            double basicPayment = durationHours * pricePerHour;
            Invoice invoice = new Invoice(basicPayment, taxService.tax(basicPayment));
            carRental.setInvoice(invoice);
        } else {
            int durationDays = (int) Math.ceil(duration/24);
            double basicPayment = durationDays * pricePerDay;
            Invoice invoice = new Invoice(basicPayment, taxService.tax(basicPayment));
            carRental.setInvoice(invoice);
        }
    }
}
