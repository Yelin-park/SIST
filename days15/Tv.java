package days15;

// public 클래스 
public class Tv { // extends java.lang.Object 생략 - 상속
	
	// 필드(field)
	public String color;
	public boolean power;
	public int channel;
	
	// 메서드(method)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void ChannelDouwn() {
		channel--;
	}
	
	// 중첩 클래스 : 클래스 안에 클래스가 선언된 것
	/*
	private class Box {
		
	}
	*/
}
