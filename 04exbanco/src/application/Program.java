package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        System.out.println("Cadastro de Conta: ");
        conta.nome = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        conta.numconta = sc.nextInt();
        sc.nextLine(); // Consumir o caractere de quebra de linha (\n)

        System.out.println("Deseja depositar uma quantia? (s/n) ");
        conta.opcao = sc.nextLine();
        if (!conta.opcao.equalsIgnoreCase("n")) {
            System.out.println("Informe o valor a depositar: ");
            conta.saldo = sc.nextDouble();
        } else {
            conta.saldo = 0;
        }

        System.out.printf("O títular da conta é: %s%n", conta.nome);
        System.out.printf("O número da conta é: %d%n", conta.numconta);
        System.out.printf("E o saldo da conta é: %.2f%n", conta.saldo);

        System.out.println("\nConta criada com sucesso!");
        System.out.println("Deseja modificar algo?");
        System.out.println("""
                1 - Alterar o nome do titular
                2 - Fazer um depósito
                3 - Fazer um saque
                4 - Exibir informações da conta
                5 - Sair
                """);

        int menu = 0;
        while (menu != 5) {
            System.out.println("""
                1 - Alterar o nome do titular
                2 - Fazer um depósito
                3 - Fazer um saque
                4 - Exibir informações da conta
                5 - Sair
                """);
            System.out.print("\nEscolha uma opção: ");
            menu = sc.nextInt();
            sc.nextLine(); // Consumir o \n após nextInt()
            if (menu == 1) {
                System.out.println("Digite o novo nome do titular: ");
                String novoNome = sc.nextLine();
                conta.novoNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
            } else if (menu == 2) {
                System.out.println("Digite um valor para depositar: ");
                double valor = sc.nextDouble();
                conta.deposito(valor);
                System.out.println("Depósito realizado com sucesso!");
            } else if (menu == 3) {
                System.out.println("Digite um valor para saque: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
                System.out.println("Saque realizado com sucesso!");
            } else if (menu == 4) {
                System.out.printf("O titular da conta é: %s%n", conta.nome);
                System.out.printf("O número da conta é: %d%n", conta.numconta);
                System.out.printf("E o saldo da conta é: %.2f%n", conta.saldo);
            }
        }

        sc.close();
    }
}