package com.spring.xe1;

public class BoardImpl {
	public void board() {
		String msg = "�Ի��";
		
		LoginImpl.login(msg);//������
		System.out.println();
		Logout.logout(msg);//������
	}
}
