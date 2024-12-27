package Application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("Current date = "+d04);
		System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
	
		System.out.println("");
		System.out.println("Current date = "+d05);
		System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("");
		System.out.println("Current date = "+d06);
		System.out.println("pastWeekLocalInstant = "+pastWeekInstant);
		System.out.println("nextWeekLocalInstant = "+nextWeekInstant);
		
		//calcular duraçoes entre duas data horas
		//Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0)); //impossivel calcular duraçao sem o time
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("");
		System.out.println("Duration t1 days = "+t1.toDays());
		System.out.println("Duration t2 days = "+t2.toDays());
		System.out.println("Duration t3 days = "+t3.toDays());
		System.out.println("Duration t4 days = "+t4.toDays());
	}

}
