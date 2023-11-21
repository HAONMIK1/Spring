package bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class BookBean {
	
	/* @NotBlank(message = "���� �Է� ����") */
	@NotEmpty(message = "���� �Է� ����")
	private String title;
	
	/* @Min(value = 5, message = "Min üũ") 5��� ���ں��� ū ���ڸ� �����*/
	/* @Max(value = 10,message = "Maxüũ")  10��� ���ں��� ���� ���ڸ� ����� */
	@Size(min = 5, message = "5���� �̻� �Է�")
	private String author;
	
	@Size(max = 5,message = "5�ڸ� ���Ϸ� �Է�")
	@Pattern(regexp = "^[0-9]+$", message = "���ڷ� �Է�")
	private String price;
	
	/* @NotBlank(message = "���ǻ� �Է� ����") */
	/* @NotEmpty(message = "���ǻ� �Է� ����") */
	@NotEmpty(message = "���ǻ� �Է� ����")
	private String publisher;
	
	
	/* @NotBlank(message = "���� 1���̻� �����ؾ���") */
	/* @NotEmpty(message = "���� 1���̻� �����ؾ���") */
	@NotNull(message = "���� 1���̻� �����ؾ���")
	private String bookstore;

	@NotNull(message = "��ۺ� �����ؾ���")
	private String kind;
	
	public String getTitle() {
		return title;
	}
	public String getBookstore() {
		return bookstore;
	}
	public void setBookstore(String bookstore) {
		this.bookstore = bookstore;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
