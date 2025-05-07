import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char continuar;
        do {
            System.out.print("Digite uma temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 9 * celsius / 5 + 32;
            System.out.println("A temperatura em Fahrenheit: " + fahrenheit);
            System.out.println("Deseja continuar (s/n)?");
            continuar = sc.next().charAt(0);
        } while(continuar!='n');

    }
    }
