package sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*CirclImpl myCirclImpl= new CirclImpl();*/
@Component("myCirclImpl")
public class CircleImpl implements Circle {
	@Autowired
	@Qualifier("PointX")
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
