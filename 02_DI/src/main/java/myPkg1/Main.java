package myPkg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
//			CalcBEanImpl1 c = new CalcBEanImpl1(5);
//			c.setSu1(10);
//			c.calculate();
		
		Resource resource = new ClassPathResource("calc.xml");
		BeanFactory factory =  new XmlBeanFactory(resource);
		
		CalcBean c = (CalcBeanImpl1)factory.getBean("c");
		c.calculate();
		
		/*
		 * MessageBeanImpl m = new MessageBeanImpl("na"); m.setGreeting("¾È³ç");
		 * m.sayHello();
		 */

		MessageBean m = (MessageBeanImpl)factory.getBean("m");
		m.sayHello();
	}

}
