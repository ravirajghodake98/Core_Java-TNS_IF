package com.cg.datetime;
import java.time.*;

public class Example5 {

	public static void main(String[] args) {
		LocalTime t= LocalTime.now(ZoneId.of("Egypt"));
		LocalDateTime dt= LocalDateTime.now(ZoneId.of("Egypt"));
		System.out.println(t);
		System.out.println(dt);
		for (String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);			
		}
	}
}