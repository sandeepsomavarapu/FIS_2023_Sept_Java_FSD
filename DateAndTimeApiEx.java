package com.fis.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateAndTimeApiEx {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		LocalDate ldate = LocalDate.now();
		System.out.println(ldate);
		System.out.println(ldate.getDayOfMonth());
		System.out.println(ldate.getDayOfYear());

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDateTime dateTime1 = LocalDateTime.of(1993, 8, 10, 10, 45);
		System.out.println(dateTime1);

		LocalDate date1 = LocalDate.now();// systemdate
		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, date1);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);// Asia/Calcutta
		
		ZoneId zone1=ZoneId.of("America/New_York");
		ZonedDateTime zt=ZonedDateTime.now(zone1);
		System.out.println(zt);//Asia/Calcutta


	}
}
