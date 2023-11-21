package com.spring.ex3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.xe2.Board;
import com.spring.xe2.Order;

public class MainClass {

	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("aop2.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Student st = (StudentImpl)factory.getBean("si");
//		Worker wk = (WorkerImpl)factory.getBean("wi");
//		
//		st.getStudentInfo();
//		wk.getWorkerInfo();
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aop2.xml"); 
		

		
		Student st =  (Student)context.getBean("si");	
		st.getStudentInfo();  
		 
		System.out.println();		
		System.out.println("========================");
		
		Worker wk = (Worker)context.getBean("wi") ;
		wk.getWorkerInfo() ;
	}
	
}

/*
Hello
출근합니다.
안녕하세요
이름 : 조정석
나이 : 10
학년 : 3
반 : 5
퇴근합니다.
=================
출근합니다.
이름 : 윤아
나이 : 35
직업 : 개발자
안녕히 계세요
퇴근합니다.
*/