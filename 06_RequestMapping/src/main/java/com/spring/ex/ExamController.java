package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ExamController {
	@RequestMapping(value = "board/form", method = RequestMethod.GET)
	public ModelAndView form() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("form");
		mav.addObject("id","kim");
		return mav;
	}
	@RequestMapping(value = "board/form1", method = RequestMethod.GET)
	public String form2(HttpServletRequest request) {
		request.setAttribute("id","abc");
		System.out.println("input()");
		return "form";
	}
}
