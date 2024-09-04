import java.util.Scanner;

public class Exercicio1while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida");
            System.out.println("Informe a senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");


        sc.close();

    }
}
