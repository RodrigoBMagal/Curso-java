package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        Estoque[] vect = new Estoque[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Estoque(nome, preco);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }
        double avg = sum / vect.length;
        System.out.printf("Preço médio: %.2f%n", avg);
        sc.close();
    }
}
