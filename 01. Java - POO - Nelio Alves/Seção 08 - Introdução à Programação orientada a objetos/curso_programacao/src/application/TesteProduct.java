package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class TesteProduct {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto1 = new Product();

        System.out.println("Informe os dados do produto");

        System.out.print("Name: ");
        produto1.nome = sc.nextLine();
        System.out.print("Price: ");
        produto1.price = sc.nextDouble();
        System.out.print("Qtd: ");
        produto1.qtd = sc.nextInt();

        System.out.println("\nInformações: " + produto1);

        System.out.println("\ninforme o número que deseja adicionar em estoque: ");
        int valorAdicionar = sc.nextInt();
        produto1.adicionarProduto(valorAdicionar);
        System.out.println("\nInformações: " + produto1);

        System.out.println("\ninforme o número que deseja remover em estoque: ");
        int valorRemove = sc.nextInt();
        produto1.removerProduto(valorRemove);
        System.out.println("\nInformações: " + produto1);

        sc.close();
    }
}
