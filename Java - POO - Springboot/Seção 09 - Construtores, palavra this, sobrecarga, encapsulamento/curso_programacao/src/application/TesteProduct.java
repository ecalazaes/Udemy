package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados do produto");

        System.out.print("Name: ");
        String nome = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(nome, price);

        System.out.println("\nInformações: " + product);

        System.out.print("\ninforme o número que deseja adicionar em estoque: ");
        int valor = sc.nextInt();
        product.adicionarProduto(valor);
        System.out.println("\nInformações: " + product);

        System.out.print("\ninforme o número que deseja remover em estoque: ");
        valor = sc.nextInt();
        product.removerProduto(valor);
        System.out.print("\nInformações: " + product);

        sc.close();
    }
}
