import java.util.Scanner;

public class TesteCondicaoTernaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        String maior = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(maior);

        sc.close();
    }
}
