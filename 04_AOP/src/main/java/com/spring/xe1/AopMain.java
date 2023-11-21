package com.spring.xe1;

public class AopMain {
	public static void main(String[] args) {
		OrderImpl myorder = new OrderImpl();
		myorder.order();
		System.out.println("=======================");
		BoardImpl myboard= new BoardImpl();
		myboard.board();
	}
}
