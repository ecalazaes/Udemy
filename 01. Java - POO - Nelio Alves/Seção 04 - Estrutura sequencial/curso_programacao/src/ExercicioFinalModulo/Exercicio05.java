package ExercicioFinalModulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double valor;
        double total = 0;

        for (int i = 1; i <= 2 ; i++) {
            System.out.println("Informe o código da peça " + i + ": ");
            cod = sc.nextInt();

            System.out.println("Informe o número de peças da peça " + i + ": ");
            qtd = sc.nextInt();

            System.out.println("Informe o valor unitário da peça " + i + ": ");
            valor = sc.nextDouble();

            total += valor * qtd;
        }
        
        System.out.printf("Valor a pagar: R$ %.2f", total);
    }
}
