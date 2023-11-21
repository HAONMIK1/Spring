package com.spring.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.ex.command.PCommand;
import com.spring.ex.command.PDeleteCommand;
import com.spring.ex.command.PListCommand;
import com.spring.ex.command.PUpdateCommand;
import com.spring.ex.command.PWriteCommand;
import com.spring.ex.command.PUpdateFormCommand;

@Controller
public class PController {
	PCommand command ;
	@RequestMapping(value = "write",method = RequestMethod.GET)
	public String form1() {
		return "form";
	}	
	@RequestMapping(value = "write",method = RequestMethod.POST)
	public String form2(Model model,HttpServletRequest request) {
		model.addAttribute("req",request);
		command = new PWriteCommand();
		command.execute(model);
		return "redirect:/list";
	}	
	@RequestMapping(value = "list")
	public String list(Model model) {
		command =new PListCommand();
		command.execute(model);
		return "list";
	}
	@RequestMapping(value = "delete")
	public String delete(Model model,HttpServletRequest request) {
		model.addAttribute("req",request);
		command =new PDeleteCommand();
		command.execute(model);
		return "redirect:/list";
	}
	@RequestMapping(value = "updateForm")
	public String updateForm(Model model,HttpServletRequest request) {
		model.addAttribute("req",request);
		command =new PUpdateFormCommand();
		command.execute(model);
		return "updateForm";
	}
	@RequestMapping(value = "update")
	public String update(Model model,HttpServletRequest request) {
		model.addAttribute("req",request);
		command =new PUpdateCommand();
		command.execute(model);
		return "redirect:/list";
	}
}
