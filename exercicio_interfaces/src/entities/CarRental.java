package entities;

import java.util.Date;

public class CarRental {

    private Vehicle vehicle;
    private Date pickupTime;
    private Date returnTime;

    private Invoice invoice;

    public CarRental() {

    }

    public CarRental(Vehicle vehicle, Date pickupTime, Date returnTime) {
        this.vehicle = vehicle;
        this.pickupTime = pickupTime;
        this.returnTime = returnTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }


}
