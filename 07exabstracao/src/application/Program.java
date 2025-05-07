package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax Payers: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("Tax Payer #" + i + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numOfEmployees));
            }
        }

        System.out.println("TAXES PAID: ");

        for (TaxPayer t : list) {
            System.out.printf(t.getName() + " $ %.2f\n", t.tax());

        }
        double total = 0.0;

        for (TaxPayer t : list) {
            total += t.tax();
        }
        System.out.printf("Total tax paid: %.2f" , total);




        sc.close();
    }
}
