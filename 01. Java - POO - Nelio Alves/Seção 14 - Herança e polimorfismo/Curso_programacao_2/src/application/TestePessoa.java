package application;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().toLowerCase().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new Fisica(name, rendaAnual,gastosSaude));
            } else {
                System.out.print("Number of Employees: ");
                int number = sc.nextInt();
                list.add(new Juridica(name, rendaAnual,number));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoa p : list){
            if (p instanceof Fisica){
                System.out.println(p.getNome() + ": $ " + String.format("%.2f",p.calcularImposto()));
            } else {
                System.out.println(p.getNome() + ": $ " + String.format("%.2f",p.calcularImposto()));
            }
        }
        sc.close();
    }
}
