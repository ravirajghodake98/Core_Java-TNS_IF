package com.cg.datetime;
//date-time in compile time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		String datetime="2022-08-07 12:30";
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l= LocalDateTime.parse(datetime, df);
		System.out.println(l);
	}
}