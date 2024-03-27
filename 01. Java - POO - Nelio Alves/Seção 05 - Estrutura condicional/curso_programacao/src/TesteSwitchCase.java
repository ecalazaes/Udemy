import java.util.Scanner;

public class TesteSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber o dia da semana: ");
        int i = sc.nextInt();

        String dia = switch (i) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-Feira";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira";
            case 7 -> "Sábado";
            default -> "Valor Inválido";
        };

        System.out.println("Dia da semana = " + dia);
        sc.close();
    }
}
