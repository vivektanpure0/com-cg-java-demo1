package com.cg.demo.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

//		Date date = new Date();
//		System.out.println(date.toString());

		LocalDate date = LocalDate.now();
		System.out.println(date.toString());
		
		LocalDate bDay = LocalDate.of(1997, 6, 13);
		System.out.println(bDay.toString());

		LocalDate iDay = LocalDate.of(1947, 8, 15);
		System.out.println(iDay.toString());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate myDate = LocalDate.parse("05-01-1960", formatter);
		System.out.println(myDate.toString());
		System.out.println(myDate.format(formatter));


//		LocalDate myDate = LocalDate.parse("1947-08-15");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate myDate1 = LocalDate.parse("08-15-1947", formatter1);
		System.out.println(myDate1.toString());
		
		LocalTime lt = LocalTime.now();
				System.out.println(lt);
				
				LocalDate manDate = LocalDate.now();
				LocalDate expDate = manDate.plusDays(180);
				LocalDate exp2Date = manDate.plusMonths(6);
				System.out.println("Manufacturing Date:" + manDate.toString());
				System.out.println("Expiry Date 1:" + expDate.toString());
				System.out.println("Expiry Date 2:" + exp2Date.toString());
				
				LocalDate expDate3 = manDate.minusDays(180);
				System.out.println("Expiry date 3: " + expDate3.toString());

				LocalDate date1 = LocalDate.now();
				LocalDate date2 = LocalDate.of(2021, 12, 31);
//				System.out.println(date1.datesUntil(date2).toString());
				System.out.println(date2.compareTo(date1));
			


	}

}
