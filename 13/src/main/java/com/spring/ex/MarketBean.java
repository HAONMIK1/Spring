package com.spring.ex;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MarketBean {
	
	@NotEmpty(message = "���̵� ����")
	private String id;
	
	@Size(min = 3,max = 5, message = "3~5�ڸ��� �Է�")
	@NotEmpty(message ="��� ����")
	private String pw;
	
	@NotEmpty(message ="���Ż�ǰ ����")
	private String product;
	
	
	//�ȉ�@NotNull(message = "�����Ͻÿ�")
	//@NotEmpty(message = "�����Ͻÿ�")
	//@NotBlank(message = "�����Ͻÿ�")
	//@Length(min = 1 , max = 50, message = "�����Ͻÿ�")
	@Size(min = 1 , max = 50, message = "�����Ͻÿ�")
	private String time;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
