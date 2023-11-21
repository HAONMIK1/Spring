package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {
	public static void main(String[] args) {
//		Point point = new PointImpl();
//		point.setXpos(3.0);//setter 통한 주입 (injection)
//		point.setYpos(4.0);
//		Circle circle = new CircleImpl(radius, point);//생성자 통한 주입
//		circle.display();
		Resource resource = new ClassPathResource("ctx1.xml");
		BeanFactory factory =  new XmlBeanFactory(resource);
		
		Circle circle = (Circle)factory.getBean("circle");
		circle.display();
		
		Point p = (Point)factory.getBean("point");
		System.out.println("원의 중심: "+ p.getYpos());
		System.out.println("원의 중심: "+ p.getXpos());
		
	}
}
/*
 * DI: dependency Injection 의존 주입
 */