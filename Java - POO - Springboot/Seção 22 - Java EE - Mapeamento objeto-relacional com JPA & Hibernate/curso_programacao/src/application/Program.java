package application;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Erick Silva", "erick@gmail.com");
        Pessoa p2 = new Pessoa(2, "Daniele Silva", "dani@gmail.com");
        Pessoa p3 = new Pessoa(3, "Ronaldo Silva", "rgs@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
