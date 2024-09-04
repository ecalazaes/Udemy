package ExercicioFinalModulo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("informe um numero: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma = " + soma);
        sc.close();
    }
}
