package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {
	public static void main(String[] args) {
//		Point point = new PointImpl();
//		point.setXpos(3.0);//setter ���� ���� (injection)
//		point.setYpos(4.0);
//		Circle circle = new CircleImpl(radius, point);//������ ���� ����
//		circle.display();
		Resource resource = new ClassPathResource("ctx1.xml");
		BeanFactory factory =  new XmlBeanFactory(resource);
		
		Circle circle = (Circle)factory.getBean("circle");
		circle.display();
		
		Point p = (Point)factory.getBean("point");
		System.out.println("���� �߽�: "+ p.getYpos());
		System.out.println("���� �߽�: "+ p.getXpos());
		
	}
}
/*
 * DI: dependency Injection ���� ����
 */