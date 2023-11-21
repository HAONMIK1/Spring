package album.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumDeleteController {
	//±»ÀÌ ¾È½áµµ ‰Î @Qualifier("myAlbumDao")
	@Autowired
	private AlbumDao albumDao;
	
	@RequestMapping("delete")
	public String actionget2(@RequestParam("num") String num) {
		albumDao.AlbumDelete(num);
		return "redirect:list.ab";
	}
	
}
