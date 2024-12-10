package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program_2 {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-11-22");
		LocalDateTime d05 = LocalDateTime.parse("2024-11-22T01:16:53");
		Instant d06 = Instant.parse("2024-11-22T01:16:54Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println("d04: " + d04.format(fmt1));

	}

}
