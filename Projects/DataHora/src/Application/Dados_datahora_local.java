package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dados_datahora_local {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		System.out.println("d04 day = "+d04.getDayOfMonth());
		System.out.println("d04 month = "+d04.getMonthValue());
		System.out.println("d04 year = "+d04.getYear());
		System.out.println("");
		System.out.println("d05  time = "+d05.getHour());
		System.out.println("d05 minute = "+d05.getMinute());
	}

}
