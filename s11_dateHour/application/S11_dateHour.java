package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class S11_dateHour {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now();
		System.out.println("Local Date: " + d01);
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("LocalDateTime: " + d02);
		
		Instant d03 = Instant.now();
		System.out.println("Instant: " + d03);
		
		LocalDate d04 = LocalDate.parse("2026-06-20");
		System.out.println("LocalDate Parse: " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2026-06-20T18:38:45");
		System.out.println("LocalDateTime Parse: " + d05);
		
		Instant d06 = Instant.parse("2026-06-20T18:38:45Z");
		System.out.println("Instant Parse: " + d06); 	
		
		Instant d07 = Instant.parse("2026-06-20T18:38:45-03:00");
		System.out.println("Instant Parse: " + d07);
		
		//FORMATTER
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d08 = LocalDate.parse("03/07/2025", fmt01);
		System.out.println("Instant Parse: " + d08); 
		
		LocalDateTime d09 = LocalDateTime.parse("24/03/2025 01:34", fmt02);
		System.out.println("LocalDateTime Fomatter: " + d09);
		
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		System.out.println("LocalDate Formatter: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 10, 27, 4, 26);
		System.out.println("LocalDateTime of: " + d11);
		
	}

}
