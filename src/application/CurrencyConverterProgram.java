package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be purchased? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.valueDollarToReal(amount,price);

        System.out.println();
        System.out.printf("Amount to be paid in reais = %.2f%n ", result);

        sc.close();
    }
}
