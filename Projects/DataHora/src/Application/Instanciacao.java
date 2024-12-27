package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciacao {

	public static void main(String[] args) {

		//https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//formato ISO8601
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		//Texto no formato customizado
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDate d09 = LocalDate.parse("20/07/2022 01:30", fmt2);
		
		//Instanciar datas a partir de dados isolados
		LocalDate d10 = LocalDate.of(2024, 12, 16);
		LocalDateTime d11 = LocalDateTime.of(2024, 12, 16, 1, 30);
		
		System.out.println("d01 = "+d01);
		System.out.println("d02 = "+d02);
		System.out.println("d03 = "+d03);
		System.out.println("");
		System.out.println("d04 = "+d04);
		System.out.println("d05 = "+d05);
		System.out.println("d06 = "+d06);
		System.out.println("d07 = "+d07);
		System.out.println("");
		System.out.println("d08 = "+d08);
		System.out.println("d09 = "+d09);
		System.out.println("");
		System.out.println("d10 = "+d10);
		System.out.println("d11 = "+d11);
	}

}
