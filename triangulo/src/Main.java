import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite as medidas do tiangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areax = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        p = (yA + yB + yC) / 2;
        double areay = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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