package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Triangulo;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x,y;
        x= new Triangulo();
        y= new Triangulo();

        System.out.println("Digite as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do tiangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();

        double areay = y.area();

        System.out.printf("Área do triangulo X: %.4f%n" , areax);
        System.out.printf("Área do triangulo Y: %.4f%n", areay);

        if(areax > areay) {
            System.out.println("Maior área: X");
        }
        else {
            System.out.println("Maior área: Y");
        }

        sc.close();
    }
}
