package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar: ");
        int n = sc.nextInt();
        double soma = 0, media;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        for (double valoresLista : vect) {
            soma += valoresLista;
        }

        media = soma / vect.length;

        System.out.println("Valores: " + Arrays.toString(vect));
        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}
