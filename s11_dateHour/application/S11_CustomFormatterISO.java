package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class S11_CustomFormatterISO {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-09-10");
		System.out.println("LocalDate Parse d04: " + d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2023-07-01T18:38:45");
		System.out.println("LocalDateTime Parse: " + d05);
		
		Instant d06 = Instant.parse("2026-06-20T18:38:45Z");
		System.out.println("Instant Parse: " + d06);
		
		// Formatar de ISO para custom
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Custom formatter d04: " + d04.format(fmt01));
		System.out.println("Custom formatter d04: " + fmt01.format(d04));
		
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Custom formatter d05: " + d05.format(fmt02));
		System.out.println("Custom formatter d05: " + d05.format(fmt01));
		
		//DATE TIME FORMATTER WITH ZONE		
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());	
		System.out.println("Custom Formatter d06: " + fmt03.format(d06));
		
		
	}
}
