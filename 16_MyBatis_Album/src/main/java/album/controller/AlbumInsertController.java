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
public class AlbumInsertController {
	//���� �Ƚᵵ �� @Qualifier("myAlbumDao")
	@Autowired
	private AlbumDao albumDao;
	
	private final String command="insert.ab";
							//������ �ƴ� ������ �ʴ� final�� �־ ������Ų �����
	@RequestMapping(value = command,method = RequestMethod.GET)
	public String actionget() {
		return "albumInsertForm";
	}
	@RequestMapping(value = command,method = RequestMethod.POST)
	public String actionget2(@Valid AlbumBean ab,BindingResult bire) {
		if(bire.hasErrors()) {
			return "albumInsertForm";
		}
		albumDao.AlbumInsert(ab);
		return "redirect:list.ab";
	}
	
}
