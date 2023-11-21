package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.MusicBean;

@Controller
public class MusicController {
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	@RequestMapping("/input1")
	public String input1(Model model,HttpServletRequest request) {
		model.addAttribute("title",request.getParameter("title"));
		model.addAttribute("singer",request.getParameter("singer"));
		model.addAttribute("price",request.getParameter("price"));
		return "result1";
	}
	@RequestMapping("/input2")
	public String input2(Model model,HttpServletRequest request ,
			@RequestParam("title") String title,
			@RequestParam("title") String singer,
			@RequestParam("title") int price) {
			MusicBean mb = new MusicBean();
			mb.setPrice(price);
			mb.setSinger(singer);
			mb.setTitle(title);
		
			model.addAttribute("mb",mb);
		return "result2";
	}
	@RequestMapping("/input3")
	public ModelAndView input3(MusicBean mb) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mb",mb);
		mav.setViewName("result3");
		return mav;
	}
	@RequestMapping("/input4")
	public String input4(MusicBean mb) {
		return "result4";
	}
	@RequestMapping("/input5")
	public String input5(@ModelAttribute("mBean") MusicBean mb) {
		return "result5";
	}
}
