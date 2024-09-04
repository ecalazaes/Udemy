package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {
    public static void main(String[] args) {

        System.out.println("Method2 START");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int i = sc.nextInt();
            System.out.println(vect[i]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Posição inválida");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e ){
            System.out.println("Input inválido");
        }
        sc.close();

        System.out.println("Fim do programa");
    }
}
