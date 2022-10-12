package com.example.testscheduler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexController {

	/**
	 * thymeleaf 호출 테스트
	 */
	
	@GetMapping("/")
	public String welcome(Model model) throws Exception {
		model.addAttribute("greeting", "HELLO");
		
		return "/welcom.html";
	}
	

}
