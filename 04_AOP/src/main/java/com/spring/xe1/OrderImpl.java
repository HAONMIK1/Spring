package com.spring.xe1;

public class OrderImpl {
	public static void order() {
		String msg ="주문";
		System.out.println("주문");
		LoginImpl.login(msg);
		System.out.println(msg +"하기");
		Logout.logout(msg);
	}

	
}
