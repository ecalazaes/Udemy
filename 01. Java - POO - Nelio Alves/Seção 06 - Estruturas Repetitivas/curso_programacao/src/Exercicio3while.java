import java.util.Scanner;

public class Exercicio3while {
    public static void main(String[] args) {
        int qtdAlcool = 0;
        int qtdGas = 0;
        int qtdDiesel = 0;

        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1. Alcool ");
            System.out.println("2. Gasolona ");
            System.out.println("3. Diesel ");
            System.out.println("4. Fim ");
            op = sc.nextInt();
            if (op == 1) qtdAlcool++;
            else if (op == 2) qtdGas++;
            else if (op == 3) qtdDiesel++;
        } while (op != 4);

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + qtdAlcool);
        System.out.println("Gasolina: " + qtdGas);
        System.out.println("Diesel: " + qtdDiesel);
        sc.close();
    }
}
