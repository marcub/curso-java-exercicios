package util;

public class CurrencyConverter {

    public static double IOF_TAX = 0.06;

    public static double amountCalculator (double dollarPrice, double dollarAmount) {
        return dollarPrice * dollarAmount * (1 + IOF_TAX);
    }
}
