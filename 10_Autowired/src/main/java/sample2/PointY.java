package sample2;

import org.springframework.stereotype.Component;

/*PointY py= new PointY();*/
@Component("PointY")
public class PointY implements Shape {
	public PointY() {
		System.out.println("PointY");
	}
	@Override
	public String make() {
		// TODO Auto-generated method stub
		return "y�� �����";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "y�� �����";
	}

}
