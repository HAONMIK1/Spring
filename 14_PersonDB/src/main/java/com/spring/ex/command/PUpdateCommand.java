package com.spring.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.pdao.Pdao;

public class PUpdateCommand implements PCommand{

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map =model.asMap();
		HttpServletRequest request= (HttpServletRequest)map.get("req");
		
		String num = request.getParameter("num");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println(id+""+name+""+age);
		Pdao dao = Pdao.getInstance();
		dao.update(id,name,age,num);
	}
	
}
