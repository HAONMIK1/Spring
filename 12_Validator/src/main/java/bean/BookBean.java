package bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class BookBean {
	
	/* @NotBlank(message = "제목 입력 누락") */
	@NotEmpty(message = "제목 입력 누락")
	private String title;
	
	/* @Min(value = 5, message = "Min 체크") 5라는 숫자보다 큰 숫자를 적어라*/
	/* @Max(value = 10,message = "Max체크")  10라는 숫자보다 작은 숫자를 적어라 */
	@Size(min = 5, message = "5글자 이상 입력")
	private String author;
	
	@Size(max = 5,message = "5자리 이하로 입력")
	@Pattern(regexp = "^[0-9]+$", message = "숫자로 입력")
	private String price;
	
	/* @NotBlank(message = "출판사 입력 누락") */
	/* @NotEmpty(message = "출판사 입력 누락") */
	@NotEmpty(message = "출판사 입력 누락")
	private String publisher;
	
	
	/* @NotBlank(message = "서점 1개이상 선택해야함") */
	/* @NotEmpty(message = "서점 1개이상 선택해야함") */
	@NotNull(message = "서점 1개이상 선택해야함")
	private String bookstore;

	@NotNull(message = "배송비 선택해야함")
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
