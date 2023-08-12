package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	
	
	public BaseBallCoach() {
		System.out.println("Hi, I am " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Do run for 30 minutes!!!";
	}

}
