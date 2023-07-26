package com.luv2code.springcoredemo.rest;

import org.springframework.web.bind.annotation.RestController;
import com.luv2code.util.Coach;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoController {
  private Coach myCoach;

  public DemoController(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping(value = "/dailyworkouts")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

}
