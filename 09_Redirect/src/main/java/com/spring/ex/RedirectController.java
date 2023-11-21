package com.spring.ex;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	@RequestMapping("/form")
	public String form() {
		return "redirect/form";
	}

	@RequestMapping("/input")
	public String result(HttpServletRequest request,RedirectAttributes rAttr) {
		request.setAttribute("name", request.getParameter("name"));
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mname", request.getParameter("name"));
		map.put("mage", request.getParameter("age"));
		rAttr.addFlashAttribute("map1",map);
		
		
		/* return "redirect/result"; */
		return "redirect:/last";
	}

	@RequestMapping("last")
	public String last(HttpServletRequest request) {
		
		return "redirect/result"; 
	}
}
