package com.spring.ex.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.ex.pdao.Pdao;
import com.spring.ex.pdto.Pdto;

public class PListCommand implements PCommand {

	@Override
	public void execute(Model model) {
		Pdao dao = Pdao.getInstance();
		ArrayList<Pdto> lists =dao.select();
		model.addAttribute("lists",lists);
	}

}
