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
	//���� �Ƚᵵ �� @Qualifier("myAlbumDao")
	@Autowired
	private AlbumDao albumDao;
	
							//������ �ƴ� ������ �ʴ� final�� �־ ������Ų �����
	@RequestMapping(value = "detail.ab")
	public String updateForm(@RequestParam("num") String num,Model model) {
		AlbumBean ab =albumDao.AlbumDetail(num);
		model.addAttribute("albumBean",ab);
		return "albumDetail";
	}

	
}
