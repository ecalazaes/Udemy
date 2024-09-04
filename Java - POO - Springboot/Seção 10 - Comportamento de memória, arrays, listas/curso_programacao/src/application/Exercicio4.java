package application;

import entities.Rent;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Rent #" + (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Rent(nome, email, room);
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i].getRoom()+": "+ vect[i].getNome() + ", " + vect[i].getEmail());
            }
        }
        sc.close();
    }
}
