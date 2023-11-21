package bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class MemberBean {
	@NotEmpty(message="이름 입력 누락")
	private String name;
	
	//@NotEmpty(message="아이디 입력 누락")
	//@Size(min =3 , max=5 , message = "3자리~5자리만 가능")
	//@Length(min = 3, max = 6, message = "3~6자리만 가능" )
	@Pattern(regexp = "^[a-z]+[0-9]+$", message = "숫자랑 영어 가능" ) /*  +	앞의 표현식이 1개 이상 or 여러개 */
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
