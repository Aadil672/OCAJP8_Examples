package com.malagupta.ocajp8;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate date1=LocalDate.of(2018,03,18);
		LocalDate date2=LocalDate.now();
		LocalDate date3=LocalDate.parse("2018-03-17");
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("========================");
		
		LocalDate date = LocalDate.parse("2020-08-30");
		
		System.out.println(date.getDayOfMonth());  //30
		System.out.println(date.getDayOfWeek());   //SUNDAY
		System.out.println(date.getDayOfYear());   //243
		System.out.println(date.getMonth());       //AUGUST
		System.out.println(date.getMonthValue());  //8
		System.out.println(date.getYear());        //2020
		
		
		System.out.println("============================");
		
		LocalDate AadilBday=LocalDate.parse("2018-03-17");
		LocalDate MaazBday=LocalDate.parse("2018-03-16");
		
		System.out.println(AadilBday.isAfter(MaazBday));   //true
		System.out.println(AadilBday.isBefore(MaazBday));  //false
		System.out.println(AadilBday.isBefore(AadilBday)); //false
		
		System.out.println("==============================");
		
		LocalDate bdayM = LocalDate.of(2018,03,18);
		
		System.out.println(bdayM.minusDays(10));
		System.out.println(bdayM.minusMonths(2));
		System.out.println(bdayM.minusWeeks(30));
		System.out.println(bdayM.minusYears(1));
		
		System.out.println("---------------------------------");
		
		LocalDate bdayP = LocalDate.of(2018,03,18);
		System.out.println(bdayP.plusDays(10));
		System.out.println(bdayP.plusMonths(2));
		System.out.println(bdayP.plusWeeks(30));
		System.out.println(bdayP.plusYears(1));
		
		
		System.out.println("-------------------------------");
		
		LocalDate firstDate = LocalDate.of(2018,03,18);
		System.out.println(firstDate.withDayOfMonth(1));
		System.out.println(firstDate.withDayOfYear(1));
		System.out.println(firstDate.withMonth(7));
		System.out.println(firstDate.withYear(1));
		
		System.out.println("---------------------------------");
		
		LocalDate interviewDate = LocalDate.of(2018,02,18);
		System.out.println(interviewDate.atTime(16, 30));
		System.out.println(interviewDate.atTime(16, 30, 20));
		System.out.println(interviewDate.atTime(16, 30, 20, 300));
		System.out.println(interviewDate.atTime(LocalTime.of(16,30)));
		
		//System.out.println(interviewDate.atTime(26, 30));  //Exception in thread "main" java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): -16
		
		System.out.println("--------------------------------------");
		
		LocalDate launchBook = LocalDate.of(2018,3,18);
		LocalDate aDate = LocalDate.of(1970,1,18);
		
		System.out.println(launchBook.toEpochDay());
		System.out.println(aDate.toEpochDay());
		
	}

}
