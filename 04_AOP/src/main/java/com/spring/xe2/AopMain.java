package com.spring.xe2;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AopMain {
	public static void main(String[] args) {
		
//		Login in = new Login();  
//		in.login();
//		
//		Logout out = new Logout();  
//		out.logout();
//		
//		OrderImpl myorder = new OrderImpl();
//		myorder.order();
//		System.out.println("=======================");
//		BoardImpl myboard= new BoardImpl();
//		myboard.board();

//		Resource resource = new ClassPathResource("aop.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Order myorder = (OrderImpl)factory.getBean("myorder");
//		Board myboard = (BoardImpl)factory.getBean("myboard");
//		
//		myorder.order();
//		myboard.board();
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aop.xml"); 
		

		
		System.out.println("--- 상품 주문 하기 ---");  
		Order myorder =  (Order)context.getBean("myorder");	
		myorder.order();  
		 
		System.out.println();		
		System.out.println("--- 게시물 등록 하기 ---");
		Board myboard = (Board)context.getBean("myboard") ;
		myboard.board() ;				
	}
}
//
//..: 0개 이상
//* : return타입
