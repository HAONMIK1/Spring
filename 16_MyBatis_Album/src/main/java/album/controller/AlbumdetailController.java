package album.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;

@Controller
public class AlbumdetailController {
	//굳이 안써도 됌 @Qualifier("myAlbumDao")
	@Autowired
	private AlbumDao albumDao;
	
							//변수가 아닌 변하지 않는 final을 넣어서 고정시킨 상수값
	@RequestMapping(value = "detail.ab")
	public String updateForm(@RequestParam("num") String num,Model model) {
		AlbumBean ab =albumDao.AlbumDetail(num);
		model.addAttribute("albumBean",ab);
		return "albumDetail";
	}

	
}
