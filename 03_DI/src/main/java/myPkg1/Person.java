package myPkg1;

public class Person {
	private String name;
	private int age;
	private int height;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, int i) {
		super();
		this.name = name;
		this.age = age;
		this.height = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String toString() {
		return name+","+age+","+height;
	}
}
