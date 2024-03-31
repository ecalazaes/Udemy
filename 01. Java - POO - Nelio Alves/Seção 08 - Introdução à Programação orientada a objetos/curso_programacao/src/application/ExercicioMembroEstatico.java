package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMembroEstatico {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dollar? ");
        double valor = sc.nextDouble();

        System.out.print("Quantos dollares voce vai comprar? ");
        double qtdDollar = sc.nextDouble();

        System.out.printf("O valor a ser pago em reais: %.2f%n", CurrencyConverter.dollarToReal(valor, qtdDollar) );

        sc.close();
    }
}
