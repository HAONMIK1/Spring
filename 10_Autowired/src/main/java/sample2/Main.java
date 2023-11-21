package sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample1.RectangleImpl;

public class Main {

	public static void main(String[] args) {
//		Shape px = new PointX();
//		PointY py= new PointY();
//		
//		CircleImpl circle = new CircleImpl();
//		circle.setPointx(px);
//		System.out.println(circle.make());
//		System.out.println("=========================");
		
//		RectangleImpl rec = new RectangleImpl();
//		rec.setPointx(py);
//		System.out.println(rec.make());
		
		String location = "/sample2/ctx.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(location);
		
		Circle c = context.getBean("myCirclImpl", Circle.class /* 다운캐스팅 */);
		System.out.println(c.make());
		System.out.println("=========================");
		
		Rectangle r = context.getBean("RectangleImpl", Rectangle.class /* 다운캐스팅 */);
		System.out.println(r.make());
		
	}

}
