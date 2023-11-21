package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		Consumer con = new Consumer();
//		Car c = new Morning();
//		
//		con.setAge(20);
//		con.setName("À±¾Æ");
//		con.setCar(c);
//		
//		System.out.println(con.getName());
//		System.out.println(con.getAge());
//		System.out.println(con.personDrive());
		String location = "ctx.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(location);
		
		
		  Person con = context.getBean("myConsumer",Person.class);
		  
		  con.setAge(20);
		  con.setName("À±¾Æ"); 
		  System.out.println(con.getName()+"" + con.getAge());
		  System.out.println(con.personDrive());
		 
	}

}
