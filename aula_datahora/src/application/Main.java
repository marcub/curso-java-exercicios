package application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate r01 = LocalDate.ofInstant(d03, ZoneId.systemDefault());

        LocalDate d04 = LocalDate.parse("2022-07-07");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-04T05:30:58");
        Instant d06 = Instant.parse("2022-10-02T15:25:57Z");
        //Instant d07 = Instant.parse("2022-10-02T15:25:57-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 01, 30);

        LocalDate pastWeek = d01.minusDays(7);
        LocalDate nextWeek = d01.plusDays(7);

        LocalDateTime pastWeekTime = d02.minusDays(7);
        LocalDateTime nextWeekTime = d02.plusDays(7);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekTime, d02);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        //System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d01.format(fmt1));
        System.out.println(fmt2.format(d02));
        System.out.println(fmt3.format(d06));
        System.out.println(d05.format(fmt4));
        System.out.println(r01);
        System.out.println(d02.getDayOfMonth());
        System.out.println(pastWeek);
        System.out.println(nextWeek);
        System.out.println(pastWeekTime);
        System.out.println(nextWeekTime);
        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);
        System.out.println(t1.toDays());
    }
}
