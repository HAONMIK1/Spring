package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.BookBean;

@Controller
public class BookController {
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	@RequestMapping("/result")
	public String result(@Valid BookBean bb,BindingResult bire) {
		String page="result";
		if(bire.hasErrors()) {
			page = "form";
		}
		return page;
	}
}
