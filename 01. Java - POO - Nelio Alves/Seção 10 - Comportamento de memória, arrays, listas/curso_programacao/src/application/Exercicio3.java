package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitas: ");
        int n = sc.nextInt();

        double mediaAlturas = 0, somaAlturas = 0;
        int contPessoas = 0;

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Dados da " + (i+1) + " pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        for (int i = 0; i < alturas.length; i++) {
            somaAlturas += alturas[i];
        }

        System.out.println();
        mediaAlturas = somaAlturas / alturas.length;
        System.out.printf("Alturas média: %.2f%n", mediaAlturas);

        for (int i = 0; i < alturas.length; i++) {
            if (idades[i] < 16) {
                contPessoas += 1;
            }
        }

        double percent = contPessoas * 100.0 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
