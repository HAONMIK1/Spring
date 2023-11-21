package album.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import album.model.AlbumBean;
import album.model.AlbumDao;
import utility.Paging;

@Controller
public class AlbumListController {
	@Autowired
	@Qualifier("myAlbumDao")
	private AlbumDao albumDao;
	
	@RequestMapping(value = "list.ab")/* �Ѱܵ� �ǰ� �ȳѰܵ� �ȴ�  �Ⱦ��� required = true �ݵ�� �Ѱܾ� �Ѵ�*/
	public ModelAndView list(HttpServletRequest  request,
			@RequestParam(value = "whatColumn", required = false ) String whatColumn, 
            @RequestParam(value="keyword", required = false) String keyword,
            @RequestParam(value = "pageNumber",required = false) String pageNumber
			) {
	      Map<String, String> map = new HashMap<String, String>();
	      map.put("keyword", "%"+keyword+"%");
	      map.put("whatColumn", whatColumn);
	      
	      int totalCount =albumDao.getTotalCount(map);
	      
	      String url = request.getContextPath()+"/list.ab";
	      
	      String pageSize= "2";
	      
			Paging pageInfo = new Paging(
					pageNumber/* ���������� ������ */,
					pageSize/* �ѹ��� �󸶳� �����ٰ� */, totalCount /* ��ü�� */, url, whatColumn, keyword);
			
			
	      // System.out.println(url);  /ex
	      List<AlbumBean> lists = albumDao.getAlbumList(pageInfo, map);
	      ModelAndView mav = new ModelAndView();
	      mav.addObject("albumLists",lists);
	      mav.addObject("totalCount",totalCount);
	      mav.addObject("pageInfo",pageInfo);
	      mav.setViewName("albumList");//albumList.jsp�� ����
	      
	      return mav ; // /WEB-INF/album/albumList.jsp

	}
}
