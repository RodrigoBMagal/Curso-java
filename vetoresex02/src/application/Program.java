package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / vect.length;

        System.out.printf("\nSoma: %.2f%n", sum);

        System.out.printf("Media: %.2f%n", avg);


        sc.close();
    }
}
