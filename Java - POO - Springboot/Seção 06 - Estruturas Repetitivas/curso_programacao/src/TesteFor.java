import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma += x;

        }

        System.out.println(soma);
        sc.close();
    }
}
