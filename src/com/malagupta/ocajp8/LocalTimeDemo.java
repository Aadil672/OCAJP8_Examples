package com.malagupta.ocajp8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDemo {
	
	public static void main(String[] args) {
		//LocalTime time0=LocalTime.of(24,59);  //Exception in thread "main" java.time.DateTimeException: Invalid value for HourOfDay (valid values 0 - 23): 24
		//LocalTime time5=LocalTime.of(124,59); //will give runtime error
		//LocalTime time6=LocalTime.of(10000000000,59);  //will give compile time error
		
		LocalTime time1=LocalTime.of(23,59);
		LocalTime time2=LocalTime.of(12,12);
		LocalTime time3=LocalTime.of(12,12,30);
		LocalTime time4=LocalTime.of(12,12,30,987654321);
		
		//System.out.println(time0);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time4);
		
		System.out.println("==========================");
		
		LocalTime localtime =  LocalTime.now();
		System.out.println(localtime);
		
		System.out.println("==========================");
		
		LocalTime time0 = LocalTime.parse("15:08:23");
		System.out.println(time0);
		
		System.out.println("==========================");
		
		System.out.println(LocalTime.MIN); //00:00
		System.out.println(LocalTime.MAX);  //23:59:59:999999999
		System.out.println(LocalTime.MIDNIGHT); //00:00
		System.out.println(LocalTime.NOON);      //12:00
		
		System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));   //true
		
		
		System.out.println("=========================");
		
		LocalTime time= LocalTime.of(16, 20, 12, 98547);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		System.out.println("========================");
		
		LocalTime AadilFinishTime= LocalTime.parse("02:40:12");
		LocalTime MaazFinishTime= LocalTime.parse("02:40:24");
		System.out.println(AadilFinishTime.isAfter(MaazFinishTime));  //false
		System.out.println(AadilFinishTime.isBefore(MaazFinishTime));  //true
		
		if(AadilFinishTime.isBefore(MaazFinishTime))
				{
			System.out.println("Aadil Win");
				}
		else System.out.println("Maaz Win");
		
		
		System.out.println("=============================");
		
		LocalTime movieStartTime = LocalTime.parse("21:00:00");
		int commuteMin = 35;
		LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
		System.out.println("Start by " + shreyaStartTime + " from office");
		
		
		System.out.println("===============================");
		
		
		int worldRecord = 10;
		
		LocalTime raceStartTime = LocalTime.of(8, 10, 55);
		LocalTime raceEndTime = LocalTime.of(8, 11, 11);
		if (raceStartTime.plusSeconds(worldRecord).isBefore(raceEndTime))    
			System.out.println("New world record");
		else    
			System.out.println("Try harder");
		
		
		System.out.println("===============================");
		
		LocalTime startTime = LocalTime.of(5, 7, 9);
		if (startTime.getMinute() < 6)    
			startTime = startTime.withMinute(0);
		System.out.println(startTime);
		
		
		System.out.println("=================================");
		
		LocalTime timeT = LocalTime.of(14, 10, 0);
		LocalDate date = LocalDate.of(2018,03,18);
		LocalDateTime dateTime = timeT.atDate(date);
		System.out.println(dateTime);
		
		//The class LocalTime defines the method atDate(), which can be passed a LocalDate instance to create a LocalDateTime instance.      
	}

}
