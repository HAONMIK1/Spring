package com.spring.ex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.ex.command.FCommand;
import com.spring.ex.command.FDeleteCommand;
import com.spring.ex.command.FListCommand;
import com.spring.ex.command.FUpdateCommand;
import com.spring.ex.command.FUpdateFormCommand;
import com.spring.ex.command.FWriteCommand;
import com.spring.ex.dto.FDto;

@Controller
public class FController {
	FCommand fc;
	@RequestMapping(value="write", method = RequestMethod.GET)
	public String write1() {
		return "write";
	}
	@RequestMapping(value="write", method = RequestMethod.POST)
	public String write2(Model model,@ModelAttribute("fDto")@Valid FDto dto,BindingResult bire) {
		if(bire.hasErrors()) {
			return "write";
		}
		fc = new FWriteCommand();
		fc.execute(model);
		return "redirect:list";
	}
	@RequestMapping("list")
	public String list(Model model) {
		fc = new FListCommand();
		fc.execute(model);

		return "list";
	}
	@RequestMapping("delete")
	public String delete(Model model,HttpServletRequest request) {

		model.addAttribute("req",request);
		fc = new FDeleteCommand();
		fc.execute(model);
		
		return "redirect:list";
	}
	@RequestMapping("updateForm")
	public String updateForm(Model model,HttpServletRequest request) {

		model.addAttribute("req",request);
		fc = new FUpdateFormCommand();
		fc.execute(model);
		
		return "updateForm";
	}
	@RequestMapping("update")
	public String update(Model model,@ModelAttribute("fDto") @Valid FDto dto,BindingResult bire) {
		if(bire.hasErrors()) {
			return "updateForm";
		}
		fc = new FUpdateCommand();
		fc.execute(model);
		return "redirect:list";
	}
	
	
}
