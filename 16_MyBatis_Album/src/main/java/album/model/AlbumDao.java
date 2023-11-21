package album.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("myAlbumDao")
public class AlbumDao {
	
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public AlbumDao() {
			
	}

	public List<AlbumBean> getAlbumList(Paging pageInfo,Map<String, String> map) {
		List<AlbumBean> lists = new ArrayList<AlbumBean>();
		
		RowBounds rowBounds= new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists =sqlSessionTemplate.selectList("album.AlbumBean.getAlbumList",map,rowBounds);
		
		return lists;
	}

	public void AlbumInsert(AlbumBean ab) {
		sqlSessionTemplate.insert("album.AlbumBean.AlbumInsert",ab);
	}

	public void AlbumDelete(String num) {
		sqlSessionTemplate.delete("album.AlbumBean.AlbumDelete",num);
		
	}
	public AlbumBean AlbumupdateForm(String num) {
		AlbumBean ab = new AlbumBean();
				ab =(AlbumBean)sqlSessionTemplate.selectOne("album.AlbumBean.getAlbumOne",num);
		return ab;
	}
	public void AlbumUpdate(AlbumBean ab) {
		sqlSessionTemplate.update("album.AlbumBean.AlbumUpdate",ab);
	}

	public AlbumBean AlbumDetail(String num) {
		AlbumBean ab = sqlSessionTemplate.selectOne("album.AlbumBean.getAlbumOne",num);
		return ab;
	}

	public int getTotalCount(Map<String, String> map) {
		int count = sqlSessionTemplate.selectOne("album.AlbumBean.getTotalCount",map);
		return count;
	}
}
