package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.MemberBean;

@Controller
public class MemberController {
	@RequestMapping(value = "/memberForm",method = RequestMethod.GET)
	public String form() {
		return "form";
	}
//	@RequestMapping(value = "/memberForm",method = RequestMethod.POST)
//	public String result() {
//		return "result";
//	}
//	
	@RequestMapping(value = "/memberForm",method = RequestMethod.POST)
	public String result(@Valid MemberBean mb,BindingResult biresult) {
		System.out.println("biresult.hasErrors()"+biresult.hasErrors());
		String page = "result";
		if(biresult.hasErrors()) { // ¿¡·¯ 
			page="form";
		}
		return page;
	}
	
}
