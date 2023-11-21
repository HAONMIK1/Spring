package sample1;

public class RectangleImpl implements Rectangle{
	Shape pt;
	int x;
	int y;
	int radius;
	public RectangleImpl() {
		System.out.println("RectangleImpl()");
	}
	
	public Shape getPointx() {
		return pt;
	}

	public void setPointx(Shape pt) {
		System.out.println("setPointx(Shape pt)");
		this.pt = pt;
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
		return pt.make();
	}

}
