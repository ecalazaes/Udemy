package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TesteProduct {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Product #" + i + " data:");
            System.out.print("Commom, used or imported (c/u/i)? ");
            char ch =  sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'c') {
                list.add(new Product(name, price));
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list){
            if (p instanceof ImportedProduct){
                System.out.println(p.priceTag());
            } else if (p instanceof UsedProduct){
                System.out.println(p.priceTag());
            } else {
                System.out.println(p.priceTag());
            }
        }

        sc.close();
    }
}
