package application;
import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;
import model.entities.NewAccount;
import model.exceptions.AccountException;

public class DateObj {

	
	public static void main(String[] args) throws ParseException {
	//public static void main(String[] args) throws ParseException {
		
		/* quando "throws ParseException" não é acrescentado ao método principal, estamos
		 * informando ao programa que esse método não lança nenhuma exceção/erro. Mas se 
		 * utilizarmos uma chamada dentro de Main que pode lançar uma exceção, como é o 
		 * caso do .parse(), o compilador vai indicar erro para que essa exceção seja 
		 * tratada ou propagada("jogada" para outro metodo resolver) no método que ela se encontra. Acrescentando esse termo, 
		 * indicdos que essa exceção não precisa ser tratada pelo método que ela está 
		 * inserida.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Operações data-hora
		
		//cria objeto modelo para formatar data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//withZone(ZoneId.systemDefault())recupera o fuso horário do computador do usuário e o horario argumento será convertido para 
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//formato ISO
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//Instanciação - agora
		
		//data local
		LocalDate d01 = LocalDate.now();
		System.out.println("d01 = " + d01);
		
		//data-hora local
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("d02 = " + d02);
		
		//data-hora global (GMT/Z/UTC - Londres)
		Instant d03 = Instant.now();
		System.out.println("d03 = " + d03);
		
		//Instanciação - ISO 8601
		
		LocalDate d04 = LocalDate.parse("2021-08-15");
		System.out.println("d04 = " + d04);
		//exemplos de formatação
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDateTime d05 = LocalDateTime.parse("2021-08-15T01:30:26");
		System.out.println("d05 = " + d05);
		//exemplos de formatação
		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		Instant d06 = Instant.parse("2021-08-15T01:30:26Z");
		System.out.println("d06 = " + d06);
		//exemplos de formatação
		//Instant não aceita .format direto
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));

		// ERRO - Exception "could not be parsed"
		//Instant d07 = Instant.parse("2021-08-15T01:30:26-03:00");
		//System.out.println("d07 = " + d07);
		
		//Instanciação - Texto customizado (DateTimeFormatter)
		
		LocalDate d08 = LocalDate.parse("15/08/2021", fmt1);
		System.out.println("d08 = " + d08);

		// ERRO - não aparece horário
		LocalDate d09 = LocalDate.parse("15/08/2021 01:30", fmt2);
		System.out.println("d09 = " + d09);
		
		LocalDate d10 = LocalDate.parse("15/08/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("d10 = " + d10);
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		System.out.println("d11 = " + d11);
		
		LocalDateTime d12 = LocalDateTime.of(2021, 8 , 15, 1, 30);
		System.out.println("d12 = " + d12);
		
		
		//laço mostra todos os fusos horários disponíveis
		System.out.println("\n---------- FUSO HORÁRIOS: ----------");
		for(String s : ZoneId.getAvailableZoneIds()) {			
			System.out.println(s);
		}
		
		//converter data-hora global para local		
		//converte o obj d06 para uma data-hora local considerando o fuso horário da maquina atual
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());		
		System.out.println(r1);
		//converte o obj d06 para uma data-hora local considerando o fuso horário como argumento
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));		
		System.out.println(r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(r3);
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r4);
		
		//obter dados de uma data-hora local
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mes = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		System.out.println("d04 dia do ano = " + d04.getDayOfYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minuto = " + d05.getMinute());
		
		//calculos com data-hora
		
		LocalDate d13 = LocalDate.parse("2024-06-03");
		LocalDateTime d14 = LocalDateTime.parse("2024-06-03T16:27:15");
		Instant d15 = Instant.parse("2024-06-03T16:27:15Z");
		
		LocalDate pastWeekLocalDate = d13.minusDays(7);
		LocalDate nextWeekLocalDate = d13.plusDays(7);
		LocalDate yearsLocalDate = d13.plusYears(7);
		
		System.out.println("a week ago = " + pastWeekLocalDate);
		System.out.println("next week = " + nextWeekLocalDate);
		System.out.println("in 7 years = " + yearsLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d14.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d14.plusDays(7);
		LocalDateTime yearsLocalDateTime = d14.plusYears(7);
		
		System.out.println("a week ago = " + pastWeekLocalDateTime);
		System.out.println("next week = " + nextWeekLocalDateTime);
		System.out.println("in 7 years = " + yearsLocalDateTime);
		
		Instant pastWeekInstant  = d15.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d15.plus(7, ChronoUnit.DAYS);
		
		System.out.println("a week ago = " + pastWeekInstant);
		System.out.println("next week = " + nextWeekInstant);
		
		//duração - deve ser calculada entre mesmos tipos (! obrigatorio ser LocalDateTime - não LocalDate, ou, converter por para horas (atTime() ou similar))
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d13.atTime(0, 0));
		System.out.println("t1 days = " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d14);
		System.out.println("t2 days = " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d15);
		System.out.println("t3 days = " + t3.toDays());
		
		//quando a primeira dara é maior que a segunda, o resultado é negativo
		Duration t4 = Duration.between(d15, pastWeekInstant);
		System.out.println("t4 days = " + t4.toDays());
		
		//enumerações, composição
		
		//utilizando classe que utiliza enum como atributo
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);		
		System.out.println(order);
		
		//conversão de string para enum - ambos serão o mesmo valor enum caso a escrita esteja correta
		
		OrderStatus os1 = OrderStatus.DELIVERED;		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		

	}
}
