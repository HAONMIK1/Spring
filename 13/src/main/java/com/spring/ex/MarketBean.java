package com.spring.ex;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MarketBean {
	
	@NotEmpty(message = "아이디 누락")
	private String id;
	
	@Size(min = 3,max = 5, message = "3~5자리로 입력")
	@NotEmpty(message ="비번 누락")
	private String pw;
	
	@NotEmpty(message ="구매상품 누락")
	private String product;
	
	
	//안됌@NotNull(message = "선택하시오")
	//@NotEmpty(message = "선택하시오")
	//@NotBlank(message = "선택하시오")
	//@Length(min = 1 , max = 50, message = "선택하시오")
	@Size(min = 1 , max = 50, message = "선택하시오")
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
