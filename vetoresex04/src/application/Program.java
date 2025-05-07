package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números pares: \n");

        int qtdpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println( numeros[i]);
                qtdpares++;
            }

        }

        System.out.printf("Quantidade de pares: %d\n", qtdpares);

        sc.close();
    }
}
