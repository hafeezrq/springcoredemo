package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
	
	public HockeyCoach() {
		System.out.println("Hi, I am " + getClass().getSimpleName());

	}

	@Override
	public String getDailyWorkout() {
		return "Practice dribbling for 20 minute";
	}

}
