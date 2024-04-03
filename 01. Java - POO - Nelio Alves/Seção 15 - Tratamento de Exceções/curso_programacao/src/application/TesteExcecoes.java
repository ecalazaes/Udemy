package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteExcecoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), dtf);

            System.out.print("Check-out date (dd/MM/yyyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyyy): ");
            checkIn = LocalDate.parse(sc.next(), dtf);
            System.out.print("Check-out date (dd/MM/yyyyy): ");
            checkOut = LocalDate.parse(sc.next(), dtf);

            reservation.udapteDates(checkIn, checkOut);
            System.out.println(reservation);
        }
        catch ( DomainException e ){
            System.out.println("Error in reservation" + e.getMessage());
        }
        catch (RuntimeException e ){
            System.out.println("Erro inesperado");
        }

        sc.close();
    }
}
