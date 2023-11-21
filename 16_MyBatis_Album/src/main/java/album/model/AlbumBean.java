package album.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AlbumBean {
	private String num;
	
	@NotEmpty(message = "제목 입력하세요")
	private String title;
	
	@Length(min = 3,max = 6,message = "3~6자리 입력하세요")
	private String singer;
	
	@Min(value = 1000,message = "1000원 이상")
	@Pattern(regexp = "^[0-9]+$",message = "숫자로 입력하세요")
	private String price;
	
	private String day;
	
	public AlbumBean() {//언제 호출 되나? album.AlbumBean.getAlbumList에서 
										//여러개이면 여러번 호출
	System.out.println("albumbean");
	
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTitle() {
		System.out.println("getTitle");
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
}
