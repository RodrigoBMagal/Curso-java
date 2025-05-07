package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter converter = new CurrencyConverter();
        System.out.println("Digite o valor em dolares: ");
        converter.dolar = sc.nextDouble();

        System.out.printf("O valor a ser pago em reais: %.2f", converter.total());

        sc.close();
    }
}
