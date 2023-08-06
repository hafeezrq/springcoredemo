package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice dribbling for 20 minute";
	}

}
