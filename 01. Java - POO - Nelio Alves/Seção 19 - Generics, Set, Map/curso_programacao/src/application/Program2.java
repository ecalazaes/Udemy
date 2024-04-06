package application;

import entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\lekiz\\OneDrive\\Documentos\\Estudos\\Udemy\\01. Java - POO - Nelio Alves\\Seção 19 - Generics, Set, Map\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most Expensive: ");
            System.out.println(x);
        }
        catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
