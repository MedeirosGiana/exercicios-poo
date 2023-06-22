package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double valueDollarToReal(double quantity, double price){
        return quantity * price * (1.0 +IOF) ;
    }
}
