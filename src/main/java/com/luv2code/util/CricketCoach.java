package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("Hi, I am " + getClass().getSimpleName());

	}

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 30 minutes!!!!!!";
  }

}
