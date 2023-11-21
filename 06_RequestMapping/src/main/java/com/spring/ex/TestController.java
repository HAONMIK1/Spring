package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("testForm")
	public String form() {
		return "test/form";
	}
	@RequestMapping("test/insert")
	public String insert(HttpServletRequest request) {
		request.setAttribute("rid",  request.getParameter("id"));
		request.setAttribute("rpw",  request.getParameter("pw"));
		return "test/result";
	}
	
}
