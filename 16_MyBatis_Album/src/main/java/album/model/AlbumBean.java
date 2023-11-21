package album.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AlbumBean {
	private String num;
	
	@NotEmpty(message = "���� �Է��ϼ���")
	private String title;
	
	@Length(min = 3,max = 6,message = "3~6�ڸ� �Է��ϼ���")
	private String singer;
	
	@Min(value = 1000,message = "1000�� �̻�")
	@Pattern(regexp = "^[0-9]+$",message = "���ڷ� �Է��ϼ���")
	private String price;
	
	private String day;
	
	public AlbumBean() {//���� ȣ�� �ǳ�? album.AlbumBean.getAlbumList���� 
										//�������̸� ������ ȣ��
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
