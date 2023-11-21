package com.spring.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/member/view", method = RequestMethod.GET)
	public String view() {
		
		return "member/view";
		/* /WEB-INF/view/member/view.jsp */
	}
	

	@RequestMapping(value = "/member/input", method = RequestMethod.GET)
	public String input(Model model, HttpServletRequest request) {
//		model.addAttribute("id","abc");
		request.setAttribute("id","abc");
		System.out.println("input()");
		return "member/input";
		/* /WEB-INF/view/member/view.jsp */
	}
	@RequestMapping(value = "/member/list")
	public ModelAndView view3() {
		ModelAndView mav = new ModelAndView("member/list");
		return mav;
	}
	@RequestMapping(value = "/member/list2")
	public ModelAndView view4() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name","태연");
		mav.addObject("pw", 1234);
		mav.setViewName("member/list2");
		return mav;
	}
}

//ModelAndView 무엇(전달할 값)을 가지고 어디(view)로 갈것인가를 설정
//web-inf 아래 있는 jsp는 controller를 통해서 실행가능