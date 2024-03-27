package ExercicioFinalModulo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        double hora = 0.0;
        double valor = 0.0;

        System.out.println("Informe o numero do funcionário: ");
        num = sc.nextInt();

        System.out.println("Informe quantas horas trabalhadas: ");
        hora = sc.nextDouble();

        System.out.println("Informe o valor por hora: ");
        valor = sc.nextDouble();

        double salario = hora * valor;

        System.out.println("Numero = " + num);
        System.out.printf("Salário = U$ %.2f", salario);

        sc.close();
    }
}
