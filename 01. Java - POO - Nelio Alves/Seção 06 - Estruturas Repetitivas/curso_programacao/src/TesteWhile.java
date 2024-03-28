import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("infome o valor: ");
        int num = sc.nextInt();
        int soma = 0;

        while ( num != 0 ){
            System.out.print("infome o valor: ");
            soma += num;
            num = sc.nextInt();

        };

        System.out.println("Soma = " + soma);
        sc.close();
    }
}
