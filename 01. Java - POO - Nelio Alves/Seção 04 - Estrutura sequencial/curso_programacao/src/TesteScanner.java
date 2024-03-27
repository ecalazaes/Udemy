import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Informe uma palavara: ");
        x = sc.nextLine();

        int i;
        System.out.println("Informe uma número inteiro: ");
        i = sc.nextInt();

        double z;
        System.out.println("Informe um número decimal: ");
        z = sc.nextDouble();

        System.out.println("Voce digitou: " + x);
        System.out.println("Voce digitou: " + i);
        System.out.println("Voce digitou: " + z);

        sc.close();
    }
}
