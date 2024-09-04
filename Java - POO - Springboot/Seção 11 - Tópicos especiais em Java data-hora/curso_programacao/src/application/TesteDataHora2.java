package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TesteDataHora2 {
    public static void main(String[] args) {
//        https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2024-04-01");
        LocalDateTime d05 = LocalDateTime.parse("2024-04-01T03:25:26");
        Instant d06 = Instant.parse("2024-04-01T02:25:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));


        System.out.println("d04 = " + d05.format(fmt1));
        System.out.println("d04 = " + d05.format(fmt2));
        System.out.println("d04 = " + d05.format(fmt4));

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06);
    }
}
