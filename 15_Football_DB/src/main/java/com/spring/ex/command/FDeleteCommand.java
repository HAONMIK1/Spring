package com.spring.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.dao.FDao;
import com.spring.ex.dto.FDto;

public class FDeleteCommand implements FCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map =model.asMap();
		HttpServletRequest request  = (HttpServletRequest)map.get("req");
		String num = request.getParameter("num");
		FDao dao= FDao.getInstance();
		dao.delete(num);
		
	}

}
