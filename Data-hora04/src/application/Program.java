package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanapassada = d04.minusDays(7);
        LocalDate proximasemana = d04.plusDays(7);

        System.out.println("Data local da semana passada: "+ semanapassada);
        System.out.println("Data local da proxima semana: "+ proximasemana);

        LocalDateTime semanapassadaLocalDateTime = d05. minusDays(7);
        LocalDateTime proximasemanaLocalDateTime = d05.plusDays(7);

        System.out.println("Horário da semana passada: "+ semanapassadaLocalDateTime);
        System.out.println("Horário da pr[oxima semana]: "+ proximasemanaLocalDateTime);

        Instant semanapassadaInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant proximasemanaInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Instante da semana passada: "+ semanapassadaInstant);
        System.out.println("Instante da proxima semana: "+ proximasemanaInstant);

        Duration t1 = Duration.between(semanapassada.atStartOfDay(), d04.atTime(0 , 0));
        Duration t2 = Duration.between(semanapassadaLocalDateTime, d05);
        Duration t3 = Duration.between(semanapassadaInstant, d06);
        Duration t4 = Duration.between(d06, semanapassadaInstant);


        System.out.println("T1 dias: " + t1.toDays());
        System.out.println("T2 Dias: " + t2.toDays());
        System.out.println("T3 dias: " + t3.toDays());
        System.out.println("T4 dias: " + t4.toDays());
    }
}
