package application;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class TesteMembroEstatico {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.circunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}
