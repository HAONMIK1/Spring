package com.spring.xe1;

public class BoardImpl {
	public void board() {
		String msg = "게사글";
		
		LoginImpl.login(msg);//공통기능
		System.out.println();
		Logout.logout(msg);//공통기능
	}
}
