package application;

import util.calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        double c = calculator.cir(raio);

        double v = calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n" , c);
        System.out.printf("Volume: %.2f%n" , v);

        System.out.printf("Valor de PI: %.2f%n" , calculator.PI);


        sc.close();
    }

}
