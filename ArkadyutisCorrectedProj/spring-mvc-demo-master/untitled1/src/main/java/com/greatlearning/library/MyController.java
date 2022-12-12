package com.greatlearning.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello1")
public class MyController {
	
	@RequestMapping("/greet")
	public String sayHello(Model model)
	{
		System.out.println("Hello");
		return "home-page";
	}

}
