package com.sapient;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FareStrategyFactory {

	static final FareStrategy weekendStrategy = new WeekendFareStrategy();
	static final FareStrategy weekdayStrategy = new WeekdayFareStrategy();
	
	public static FareStrategy getFareStrategy (LocalDateTime localDateTime) {
		
		if(localDateTime.getDayOfWeek() == DayOfWeek.SUNDAY || localDateTime.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return weekendStrategy;
		}
		else 
			return weekdayStrategy;
	}
}
