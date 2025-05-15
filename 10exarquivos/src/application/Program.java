package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> produtos = new ArrayList<>();

        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        File souceFile = new File(path);
        String sourceFolderStr = souceFile.getParent();

        boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String csv = br.readLine();
            while (csv != null) {
                String[] fields = csv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                produtos.add(new Product(name, price, quantity));

                csv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for (Product p : produtos){
                    bw.write(p.getName() + "," + String.format ("%.2f", p.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED!");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error reading file: "+ e.getMessage());
        }


        sc.close();
    }
}
