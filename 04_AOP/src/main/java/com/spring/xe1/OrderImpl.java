package com.spring.xe1;

public class OrderImpl {
	public static void order() {
		String msg ="�ֹ�";
		System.out.println("�ֹ�");
		LoginImpl.login(msg);
		System.out.println(msg +"�ϱ�");
		Logout.logout(msg);
	}

	
}
