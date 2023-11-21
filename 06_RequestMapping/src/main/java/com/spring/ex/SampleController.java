package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/sample")//����Ǵ� requestMapping �� ������ ������ ���� �ؿ��� �Ƚᵵ �� sample �տ� /�� �ᵵ �ǰ� �Ƚᵵ ��
public class SampleController {
	@RequestMapping(value = "/a")
	public ModelAndView view1() {
		ModelAndView ma =new ModelAndView("/a");
		return ma;
	}

	@RequestMapping(value = "b") /* /�� �ᵵ �ǰ� �Ƚᵵ �� */
	public String view2() {
		return "sample/b";
	}

	@RequestMapping(value = "/c")
	public ModelAndView view3() {
		ModelAndView mav =new ModelAndView("/sample/c");
		return mav;
	}
}
