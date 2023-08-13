package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.util.Coach;

@RestController
public class DemoController {
  private Coach myCoach;

  /*
   * public DemoController(Coach theCoach) { myCoach = theCoach; }
   */
  public DemoController() {
}

  @Autowired
  public void setMyCoach(@Qualifier("cricketCoach") Coach theCoach) {
    this.myCoach = theCoach;
  }

  @GetMapping(value = "/dailyworkouts")
  public String getDailyWorkout() {
    return this.myCoach.getDailyWorkout();
  }

}
