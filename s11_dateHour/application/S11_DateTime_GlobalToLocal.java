package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class S11_DateTime_GlobalToLocal {

	public static void main(String[] args) {
		// Para converter hora global para local é necessário informar o fusohorario.
		
		//Todos os zoneId
		for (String timezone : ZoneId.getAvailableZoneIds()) {
			//System.out.println(timezone);
		}
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2025-06-25T01:32:56Z"); //UTC Timezone
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("Instant to Local r1 = " + r1);
		System.out.println("Instant to Local r2 = " + r2);
		System.out.println("Instant to Local r3 = " + r3);
		System.out.println("Instant to Local r4 = " + r4);
		
		// Obtendo o dia de uma data local
		System.out.println("Local Date d04 dia = " + d04.getDayOfMonth());
		System.out.println("Local Date d04 mês = " + d04.getMonthValue());
		System.out.println("Local Date d04 ano = " + d04.getYear());
		System.out.println("Local Date d04 dia da semana = " + d04.getDayOfWeek());
		
		System.out.println("Local Date d05 dia = " + d05.getHour());
		System.out.println("Local Date d05 dia = " + d05.getMinute());
	}

}
