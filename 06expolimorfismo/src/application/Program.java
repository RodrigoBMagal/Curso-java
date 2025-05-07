package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<Product>();
        
        System.out.print("Enter the number os products: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Product " + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();



            if (ch == 'c') {
                products.add(new Product(name, price));
            }
            else if (ch == 'u') {
                System.out.print("Enter manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.print("Custom fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }

        }

        System.out.println("PRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        

        
        
        sc.close();
    }
}
