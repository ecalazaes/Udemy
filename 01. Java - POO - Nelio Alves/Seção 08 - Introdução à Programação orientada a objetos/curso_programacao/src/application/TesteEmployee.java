package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class TesteEmployee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();

        System.out.print("Informe o nome: ");
        String nome = sc.nextLine();
        e1.setName(nome);

        System.out.print("Informe o Salário Bruto: ");
        double salarioBruto = sc.nextDouble();
        e1.setGrossSalary(salarioBruto);

        System.out.print("Informe a Taxa: ");
        double taxa = sc.nextDouble();
        e1.setTax(taxa);

        System.out.println("\nName: " + e1.getName());
        System.out.printf("Gross Salary: %.2f%n", e1.getGrossSalary());
        System.out.printf("Tax: %.2f%n", e1.getTax());
        System.out.printf("\nEmployee: " + e1.getName() + ", $ %.2f%n", e1.netSalary());

        System.out.println("\nQual o percentual para aumentar no salário: ");
        double percentage = sc.nextDouble();
        e1.increaseSalary(percentage);

        System.out.printf("Updated data: " + e1.getName() + ", $ %.2f%n", e1.netSalary());

        sc.close();
    }
}
