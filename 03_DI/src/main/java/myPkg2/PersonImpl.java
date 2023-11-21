package myPkg2;

public class PersonImpl implements Person{
	private String name;
	private int age;
	private int height;
	public PersonImpl() {
		// TODO Auto-generated constructor stub
	}
	public PersonImpl(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public void setAge(int age) {
		this.age = age;
		
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}
	@Override
	public void setHeight(int height) {
		this.height = height;
		
	}
	public String toString() {
		return name+","+age+","+height;
	}

}
