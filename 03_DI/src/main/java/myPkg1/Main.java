package myPkg1;

public class Main {

	public static void main(String[] args) {
		Person per = new Person("¼³Çö",30,168);
		Student stu = new Student();
		stu.setKor(70);
		stu.setEng(80);
		stu.setPer(per);
		MyInfo my =new MyInfo();
		my.setStu(stu);
		my.setPer(per);
		System.out.println(stu.toString());
		System.out.println(per);
		System.out.println(my);
	}

}
