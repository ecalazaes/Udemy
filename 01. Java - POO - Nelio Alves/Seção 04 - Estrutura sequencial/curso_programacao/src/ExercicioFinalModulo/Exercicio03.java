package ExercicioFinalModulo;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe o número " + i + ": ");
            if (i == 1) a = sc.nextInt();
            else if ( i == 2) b = sc.nextInt();
            else if (i == 3) c = sc.nextInt();
            else d = sc.nextInt();
        }

        int diff = ((a * b) - (c * d));

        System.out.println("Diferença = " + diff);
        sc.close();
    }
}
