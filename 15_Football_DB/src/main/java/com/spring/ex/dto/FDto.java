package com.spring.ex.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class FDto {
	
	private String num;
	
	
	@NotEmpty(message = "아이디 작성")
	private String id;
	
	@NotEmpty(message = "비번 작성")
	private String pw;
	
	@NotNull(message = "우승예상국가 선택")
	private String win;
	
	@NotNull(message = "16강 예상국가 선택")
	private String round16;
	
	public FDto() {
	}
	public FDto(String num, String id, String pw, String win, String round16) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.win = win;
		this.round16 = round16;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
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
	public String getWin() {
		return win;
	}
	public void setWin(String win) {
		this.win = win;
	}
	public String getRound16() {
		return round16;
	}
	public void setRound16(String round16) {
		this.round16 = round16;
	}
}
