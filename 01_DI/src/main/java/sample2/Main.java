package sample2;

public class Main {
	public static void main(String[] args) {
		double radius = 10.0;
		
		Point point = new PointImpl();
		point.setXpos(3.0);//setter 통한 주입 (injection)
		point.setYpos(4.0);
		Circle circle = new CircleImpl(radius, point);//생성자 통한 주입
		circle.display();
	}
}
/*
 * DI: dependency Injection 의존 주입
 */