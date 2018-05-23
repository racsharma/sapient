package com.sapient;

import java.time.LocalDateTime;

public class FareCalculator {
	
	public double getFare(Station source, Station destination , LocalDateTime localTime)
	{
		FareStrategy fareStrategy  = FareStrategyFactory.getFareStrategy(localTime);
		int distance = source.distance(destination);
		double fare = distance * fareStrategy.getFarePerStation();
		return fare;
	}

}
