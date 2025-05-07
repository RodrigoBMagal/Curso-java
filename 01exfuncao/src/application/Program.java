package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Coloque a largura do retangulo: ");
        retangulo.width = sc.nextDouble();

        System.out.println("Coloque a altura do retangulo: ");
        retangulo.height = sc.nextDouble();

        System.out.println("Área do retangulo: " + retangulo.area());
        System.out.println("perímetro do retangulo: " + retangulo.perimetro());
        System.out.println("diagonal do retangulo: " + retangulo.diagonal());


        sc.close();
    }

}
