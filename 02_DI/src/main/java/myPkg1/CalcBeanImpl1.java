package myPkg1;

public class CalcBeanImpl1 implements CalcBean{
	private int su1;
	private int su2;
	
	public CalcBeanImpl1(int su2) {
		this.su2 = su2;
	}
	public void setSu1(int su1) {
		this.su1=su1;
	}
	@Override
	public void calculate() {
		System.out.println("����"+(su1+su2));
		System.out.println("�E��"+(su1-su2));
		System.out.println("���ϱ�"+(su1*su2));
		System.out.println("������"+(su1/su2));
	}
}
