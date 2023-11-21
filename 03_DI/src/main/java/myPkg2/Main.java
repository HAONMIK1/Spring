package myPkg2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
//		Person per = new Person("¼³Çö",30,168);
//		Student stu = new Student();
//		stu.setKor(70);
//		stu.setEng(80);
//		stu.setPer(per);
//		myInfo my =new myInfo();
//		my.setStu(stu);
//		my.setPer(per);
//		System.out.println(stu.toString());
//		System.out.println(per);
//		System.out.println(my);
		
//	1.	Resource resource = new ClassPathResource("cong.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
//	2.	ApplicationContext factory = 
//				new FileSystemXmlApplicationContext("classpath:cong.xml");

/* 3. */AbstractApplicationContext factory =
				new GenericXmlApplicationContext("cong.xml");
		
		MyInfo my =(MyInfo)factory.getBean("my");
		
			my.personPrint();
			my.studentPrint();
			System.out.println(my);
	}

}
