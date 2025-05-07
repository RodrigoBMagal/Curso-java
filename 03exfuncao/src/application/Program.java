package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota do estudante: ");
        estudante.nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do estudante: ");
        estudante.nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota do estudante: ");
        estudante.nota3 = sc.nextDouble();

        System.out.println("A nota total do estudante é: " + estudante.total());

        if (estudante.total() > estudante.minima) {
            System.out.println("Passou.");
        }
        else {
            System.out.println("Reprovou.");
            System.out.println("Faltou " + estudante.falta() + " pontos");
        }

        sc.close();

    }
}
