package bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberBean {
	@NotEmpty(message="�̸� �Է� ����")
	private String name;
	
	//@NotEmpty(message="���̵� �Է� ����")
	//@Size(min =3 , max=5 , message = "3�ڸ�~5�ڸ��� ����")
	//@Length(min = 3, max = 6, message = "3~6�ڸ��� ����" )
	@Pattern(regexp = "^[a-z]+[0-9]+$", message = "���ڶ� ���� ����" ) /*  +	���� ǥ������ 1�� �̻� or ������ */
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
