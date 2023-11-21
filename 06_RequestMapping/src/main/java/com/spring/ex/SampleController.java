package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/sample")//공통되는 requestMapping 이 있으면 위에다 쓰고 밑에는 안써도 됌 sample 앞에 /는 써도 되고 안써도 됌
public class SampleController {
	@RequestMapping(value = "/a")
	public ModelAndView view1() {
		ModelAndView ma =new ModelAndView("/a");
		return ma;
	}

	@RequestMapping(value = "b") /* /는 써도 되고 안써도 됌 */
	public String view2() {
		return "sample/b";
	}

	@RequestMapping(value = "/c")
	public ModelAndView view3() {
		ModelAndView mav =new ModelAndView("/sample/c");
		return mav;
	}
}
