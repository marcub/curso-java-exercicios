package entities;

public class NaturalPerson extends Person {

    private Double healthSpending;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (annualIncome < 20000) {
            tax = annualIncome * 0.15;
        } else {
            tax = annualIncome * 0.25;
        }

        if (healthSpending != 0) {
            tax -= healthSpending * 0.5;
        }
        return tax;
    }
}
