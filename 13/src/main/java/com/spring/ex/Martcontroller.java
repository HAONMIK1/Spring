package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Martcontroller {
	@RequestMapping("/form")
	public String form() {
		return "insertForm"; 
	}
	
	@RequestMapping("/insertProc")
	public String insertProc(@Valid MarketBean mb,BindingResult bire) {
		String page = "result"; 
		if(bire.hasErrors()) {
			page = "insertForm";
		}
		return page; 
	}
	
}
