package sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("RectangleImpl")
public class RectangleImpl implements Rectangle{
	@Autowired
	@Qualifier("PointY")
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
