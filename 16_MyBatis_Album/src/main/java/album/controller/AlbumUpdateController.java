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
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumUpdateController {
	//±»ÀÌ ¾È½áµµ ‰Î @Qualifier("myAlbumDao")
	@Autowired
	private AlbumDao albumDao;
	@RequestMapping(value = "updateForm.ab")
	public String updateForm(HttpServletRequest request) {
		String num = request.getParameter("num");
		AlbumBean ab =albumDao.AlbumupdateForm(num);
		request.setAttribute("albumBean", ab);
		return "albumUpdateForm";
	}
	@RequestMapping(value = "update.ab")
	public String update(@ModelAttribute("albumBean") @Valid AlbumBean ab,BindingResult bire) {
		if(bire.hasErrors()) {
			return "albumUpdateForm";
		}
		albumDao.AlbumUpdate(ab);
		return "redirect:list.ab";
	}
	
}
