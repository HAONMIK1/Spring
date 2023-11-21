package sample3;

import org.springframework.stereotype.Component;

public class Consumer implements Person{
	private String name;
	private int age;
	
	private Car car;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public void setName(String name) {
		this.name =name;

	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setAge(int age) {
		this.age =age	;	
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public String personDrive() {
		// TODO Auto-generated method stub
		return car.drive();
	}



}
