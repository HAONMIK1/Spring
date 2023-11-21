package com.spring.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.dao.FDao;
import com.spring.ex.dto.FDto;

public class FWriteCommand implements FCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map =model.asMap();
		FDto dto  = (FDto)map.get("fDto");
		FDao dao= FDao.getInstance();
		dao.write(dto);
		
	}

}
