package myPkg1;

public class Student {
	private int kor;
	private int eng;
	private Person per;
	public Student(int kor, int eng, Person per) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.per = per;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public String toString() {
		return eng+","+kor+","+ per;
	}
}
