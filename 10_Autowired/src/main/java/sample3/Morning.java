package sample3;

import org.springframework.stereotype.Component;

public class Morning implements Car{
	public Morning() {
	}
	@Override
	public String drive() {
		return "Morning-drive";
	}

}
