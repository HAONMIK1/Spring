package sample4;

import org.springframework.stereotype.Component;

@Component("Moring")
public class Morning implements Car{
	public Morning() {
		System.out.println("Morning()");
	}
	@Override
	public String drive() {
		return "Morning-drive";
	}

}
