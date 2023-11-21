package sample3;


public class CircleImpl implements Circle {
	private double radius;
	private Point point; 

	public CircleImpl(double radius, Point point) {
		this.radius = radius;
		this.point = point;
	}
	@Override
	public void display() {
		System.out.println("원의중심:"+point.getXpos()+","+point.getYpos());
		System.out.println("원의면적:" + getArea());
	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2.0);
	}

}
