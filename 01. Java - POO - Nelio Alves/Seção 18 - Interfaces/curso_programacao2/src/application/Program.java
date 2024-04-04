package application;

import model.entities.Contract;
import model.entities.ContractService;
import model.entities.Installment;
import model.entities.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate dataInicio = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        Contract obj = new Contract(numero, dataInicio, valorContrato);

        System.out.print("Entre com o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj, numeroParcelas);

        System.out.println("Parcelas:");
        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }


        sc.close();
    }
}
