package sample2;

import org.springframework.stereotype.Component;

/*PointX py= new PointX();*/
@Component("PointX"/* �������� */)
public class PointX implements Shape{
	
	public PointX() {
		System.out.println("Pointx");
	}
	
	@Override
	public String make() {
		// TODO Auto-generated method stub
		return "x�� �����";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "x�� �����";
	}

}
