package com.spring.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bean.MemberBean;
import bean.PersonBean;

@Controller
public class ExamController {
	@RequestMapping("person/input")
	public String  result(HttpServletRequest request) {
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		System.out.println(name);
		System.out.println(age);
		return "/person/result";
	}
	
	@RequestMapping("person/input2")
	public String result1(HttpServletRequest request,
			@RequestParam("name") String name, @RequestParam("age") String age) {
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		PersonBean pb =new PersonBean();
		
		pb.setName(name);
		pb.setAge(Integer.parseInt(age));
		pb.setAddr("seoul");
		
		request.setAttribute("pb", pb);
		
		
		return "/person/result2";
	}
	@RequestMapping(value = "person/form" , method = RequestMethod.GET )
	public String result2() {
		return "/person/form";
	}
	
	@RequestMapping(value ="person/input3" , method = RequestMethod.POST)
	public String result3(HttpServletRequest request,@RequestParam("name") String name, @RequestParam("age") String age,
			@RequestParam("pw") String pw, @RequestParam("id") String id) {
		
		
		MemberBean mb =new MemberBean();
		
		mb.setId(id);
		mb.setPw(pw);
		mb.setName(name);
		mb.setAge(Integer.parseInt(age));
		
		request.setAttribute("mb", mb);
		
		
		return "person/result3";
	}
	@RequestMapping(value ="person/input4" , method = RequestMethod.POST)
	public String result4(MemberBean mb /*command 객체, 자동 속성 설정*/,
				HttpServletRequest request) {
		
//		System.out.println(memberBean.getId());
//		System.out.println(memberBean.getPw());
//		System.out.println(memberBean.getName());
//		System.out.println(memberBean.getAge());
//		
		/* request.setAttribute("memberBean", mb); */
		
		return "person/result4";
	}
	@RequestMapping(value ="person/input5" , method = RequestMethod.POST)
	public String result5(@ModelAttribute("mbean") MemberBean mb /*command 객체, 자동 속성 설정*/) {
		
//		System.out.println(mbean.getId());
//		System.out.println(mbean.getPw());
//		System.out.println(mbean.getName());
//		System.out.println(mbean.getAge());
//		
		/* request.setAttribute("mbean", mb); */
		
		return "person/result5";
	}
	
	
}
