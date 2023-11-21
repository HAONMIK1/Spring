package sample1;

public class CircleImpl implements Circle {
	Shape pointx;
	int x;
	int y;
	int radius;
	public CircleImpl() {
		System.out.println("CircleImpl()");
	}
	
	public Shape getPointx() {
		return pointx;
	}

	public void setPointx(Shape pointx) {
		System.out.println("setPointx()");
		this.pointx = pointx;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return pointx.make();
	}

}
