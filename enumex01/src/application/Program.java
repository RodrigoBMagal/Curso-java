package application;

import entities.ContratoHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o nome do departamento: ");
        String departamentoNome = sc.nextLine();

        System.out.println("Coloque os dados do Funcionário: ");
        System.out.print("Nome: ");
        String nomeTrab = sc.nextLine();
        System.out.print("Nível do funcionário: ");
        String nvelTrab = sc.nextLine();
        System.out.print("Salário base: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(new Departamento(departamentoNome), nomeTrab, NivelTrabalhador.valueOf(nvelTrab), salario);

        System.out.println("Quantos contratos para esse funcionário? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Coloque os dados do contrato #" + i);
            System.out.print("Data DD/MM/YYYY: ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração em horas: ");
            int horas = sc.nextInt();
            ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
            funcionario.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.print("Coloque o mês e o ano para calcular o valor recebido (MM/YYYY): ");
        String mes_ano = sc.next();
        int mes = Integer.parseInt(mes_ano.substring(0, 2));
        int ano = Integer.parseInt(mes_ano.substring(3));

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
        System.out.println("Recebido por " + mes_ano + ": " + String.format("%.2f", funcionario.calcularSalario(ano, mes)));




        sc.close();
    }
}
