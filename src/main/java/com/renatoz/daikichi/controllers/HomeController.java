package com.renatoz.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String welcome() {
        return "Welcome!";
    }
    
    @RequestMapping(value = "/today", method = RequestMethod.GET)
    public String todayFortune() {
        return "Today you will find luck in all your endeavors!";
    }
    
    @RequestMapping(value = "/tomorrow", method = RequestMethod.GET)
    public String tomorrowFortune() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    
    @RequestMapping(value = "/travel/{city}", method = RequestMethod.GET)
    public String travelFortune(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }
    
    @RequestMapping(value = "/lotto/{number}", method = RequestMethod.GET)
    public String lottoFortune(@PathVariable int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}