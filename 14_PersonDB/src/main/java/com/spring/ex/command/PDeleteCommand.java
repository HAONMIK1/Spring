package com.spring.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.pdao.Pdao;

public class PDeleteCommand implements PCommand{

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map =model.asMap();
		HttpServletRequest request= (HttpServletRequest)map.get("req");
		
		String num = request.getParameter("num");
		Pdao dao = Pdao.getInstance();
		dao.delete(num);
	}
	
}
