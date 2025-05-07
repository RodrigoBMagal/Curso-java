package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionários deseja adicionar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Funcionario # " + (i + 1) + ": ");
            System.out.println("ID: ");
            int id = sc.nextInt();

            while(temId(list, id)) {
                System.out.println("O ID é inválido! ");
                id = sc.nextInt();
            }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp);
            }

        System.out.print("Coloque o id do funcionario que terá o salário aumentado: ");

        int idsalario = sc.nextInt();

        Funcionario func = list.stream().filter( x-> x.getId() == idsalario).findFirst().orElse(null);

        if (func == null) {
            System.out.println("O ID não existe");
        }
        else {
            System.out.print("Entre com a porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.aumentarSalario(porcentagem);
        }

        System.out.println("\n Lista de funcionários: ");
        for (Funcionario f : list) {
            System.out.println(f);
        }

        sc.close();
    }
    public static int posicao(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    public static boolean temId(List<Funcionario> list, int id) {
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}
