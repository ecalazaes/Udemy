package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("How many employees will be registred: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Employee #"+(i+1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId (list, id)){
                System.out.print("Id already taken. try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println();

            Funcionario emp = new Funcionario(id, nome, salario);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int ID = sc.nextInt();

        Funcionario emp = list.stream().filter(x -> x.getId() == ID).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double valor = sc.nextDouble();
            emp.aumentarSalario(valor);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for(Funcionario x : list){
            System.out.printf("%d, %s, %.2f%n", x.getId(), x.getName(), x.getSalario());
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
