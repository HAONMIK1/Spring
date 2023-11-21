package myPkg2;

public class Studentimpl implements Student{
	private int kor;
	private int eng;
	private PersonImpl per;
	public Studentimpl(int kor, int eng, PersonImpl per) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.per = per;
	}
	public Studentimpl() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getKor() {
		return kor;
	}
	@Override
	public void setKor(int kor) {
		// TODO Auto-generated method stub
		this.kor = kor;
		
	}
	@Override
	public int getEng() {
		// TODO Auto-generated method stub
		return eng;
	}
	@Override
	public void setEng(int eng) {
		this.eng = eng;
		
	}
	@Override
	public PersonImpl getPer() {
		// TODO Auto-generated method stub
		return per;
	}
	@Override
	public void setPer(PersonImpl per) {
		this.per = per;
		
	}
	public String toString() {
		return eng+","+kor+","+ per;
	}
	

}
