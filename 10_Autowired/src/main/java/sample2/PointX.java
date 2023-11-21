package sample2;

import org.springframework.stereotype.Component;

/*PointX py= new PointX();*/
@Component("PointX"/* 참조변수 */)
public class PointX implements Shape{
	
	public PointX() {
		System.out.println("Pointx");
	}
	
	@Override
	public String make() {
		// TODO Auto-generated method stub
		return "x를 만들다";
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return "x를 지우다";
	}

}
