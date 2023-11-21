package sample1;

public class Circle {
	private double radius;
	private Point point;
	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	public void display() {
		System.out.println("���� �߽�: "+ point.getYpos()+" "+point.getYpos());
		System.out.println("���� ����: "+getArea());
		
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2.0);
	}

}