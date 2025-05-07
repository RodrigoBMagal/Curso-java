package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Salario Bruto: ");
        funcionario.salario = sc.nextDouble();

        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println("Salario Liquido: " + funcionario.salarioLiq());

        System.out.println("Quanto você deseja aumentar o salário do funcionário? ");
        funcionario.porcentagem = sc.nextDouble();

        System.out.println("Updated data: " + funcionario);

    }
}
