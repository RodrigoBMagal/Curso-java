package application;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();

        }
        for (int num1 : vect){
            if (num1 < 0){
                System.out.printf("Número %d é negativo.%n ", num1);
            }
        }


        sc.close();
    }
}
