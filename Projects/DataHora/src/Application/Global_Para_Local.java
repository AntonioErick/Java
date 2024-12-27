package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Global_Para_Local {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//converte o instant para uma data local considerando o fuso horário da maquina
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); 
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); 
		LocalDateTime r3 = LocalDateTime.ofInstant(d06,  ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); 
		
		/*timezone
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("");
		System.out.println("r3 = "+r3);
		System.out.println("r4 = "+r4);
	}

}
