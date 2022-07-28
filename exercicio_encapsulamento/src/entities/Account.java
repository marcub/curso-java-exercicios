package entities;

public class Account {

    private String accountNumber;
    private String clientName;
    private double accountBalance;

    public Account(String accountNumber, String clientName) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
    }

    public Account(String accountNumber, String clientName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        depositBalance(initialDeposit);
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void depositBalance (double depositBalance) {
        accountBalance += depositBalance;
    }

    public void withdrawalBalance (double withdrawalBalance) {
        accountBalance -= withdrawalBalance + 5;
    }

    public String toString() {
        return "Account " + getAccountNumber() + ", Holder: " + getClientName() + ", Balance: $ " + String.format("%.2f", getAccountBalance());
    }
}
