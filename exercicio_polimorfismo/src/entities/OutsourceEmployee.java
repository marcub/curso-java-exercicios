package entities;

public class OutsourceEmployee extends Employee {

    private final static Double BONUS_TAX = 1.1;
    private Double additionalCharge;

    public OutsourceEmployee() {
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * BONUS_TAX;
    }
}
