package com.greatlearning.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class CustomController {

    @RequestMapping(value = "/homepage", method = RequestMethod.GET)
    public String showHomePage(){
        return "home-page";
    }

}
