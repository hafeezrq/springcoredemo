package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do run for 30 minutes!!!";
	}

}
