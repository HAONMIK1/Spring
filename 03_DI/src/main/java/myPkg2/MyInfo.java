package myPkg2;

public class MyInfo {
	private PersonImpl per;
	private Studentimpl	stu;
	public MyInfo() {
		// TODO Auto-generated constructor stub
	}
	public MyInfo(PersonImpl per, Studentimpl stu) {
		super();
		this.per = per;
		this.stu = stu;
	}
	public PersonImpl getPer() {
		return per;
	}
	public void setPer(PersonImpl per) {
		this.per = per;
	}
	public Studentimpl getStu() {
		return stu;
	}
	public void setStu(Studentimpl stu) {
		this.stu = stu;
	}
	public void personPrint() {
		System.out.println(per.getName());
		System.out.println(per.getAge());
		System.out.println(per.getHeight());
	}
	public void studentPrint() {
		System.out.println(stu.getKor());
		System.out.println(stu.getEng());
	}
	public String toString() {
		return per+","+stu;
	}
}
