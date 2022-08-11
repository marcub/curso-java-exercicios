package entities;

public class LegalPerson extends Person {

    private Integer numEmployees;

    public LegalPerson() {
    }

    public LegalPerson(String name, Double annualIncome, Integer numEmployees) {
        super(name, annualIncome);
        this.numEmployees = numEmployees;
    }

    public Integer getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(Integer numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (numEmployees > 10) {
            tax = annualIncome * 0.14;
        } else {
            tax = annualIncome * 0.16;
        }
        return tax;
    }
}
