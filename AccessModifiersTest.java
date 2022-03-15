package days01;

import days18.AccessModifier;

public class AccessModifiersTest extends AccessModifier {
	
	// 상속으로 인하여 AccessModifier 멤버들이 있다고 가정
	// 서로 다른 패키지 안에 있는 클래스를 상속관계로 바꾸면..
	public void disp() {
		this.pub = 100; // public 멤버
		this.pro = 20; // protected 멤버 : 패키지가 달라도(외부패키지) 상속관계가 있다면 접근 가능하다.
	}
	
	// days18.AccessModifier 클래스의 필드 접근지정자 테스트
	public static void main(String[] args) {
		// 패키지 외부에서 테스트
		AccessModifier am = new AccessModifier(); // import days18.AccessModifier; 되어짐
		// am.pub;	접근지정자 public 접근가능
		
		// AccessModifierTest(days01)와 AccessModifier(days18)는 서로 상속관계가 없다.
		
	} // main
	
	/*
	// days15. Tv, Person 접근 지정자 public, default 테스트 하기 위한 외부 패키지 안의 클래스
	// [멤버(필드, 메서드, 생성자) 앞에 접근지정자 테스트]
	public static void main(String[] args) {
		
		// [다른 패키지]에 있는 Time 객체 선언 및 생성
		Time t = new Time();
		t.miliseconds = 1234; // public
		t.nanoseconds = 1234; // public
		t.printTime();        // public
		
	} // main

	/*
	// [클래스 앞에 접근지정자 테스트]
	public static void main(String[] args) {
		 // 2-1) 다른 패키지 안에서 public  클래스 Tv와 default  클래스 Person 참조가 가능한지 확인
		 // 		days01.ModifiersTest.main() 메서드에서
		 // 			ㄴ public days15.Tv      클래스 참조 사용
		 // 			ㄴ default days15.Person 클래스 참조 사용
		 //  
		 //	ㄱ. Tv 객체 선언하고 생성
		 Tv t1 = new Tv(); // 다른 패키지 안에서 Tv 클래스는 참조 가능하다(확인)
		 t1.channel = 11;  // 에러가 안나도록 Tv 클래스 안에 있는 멤버들 앞에 public 다 붙여놓기 -> 나중에 배울 것
		 t1.channelUp();
		 System.out.println(t1.channel);
		 
		 // 에러메시지 : Person cannot be resolved to a type
		 // 해석 : Person 타입을 인식할 수 없다
		 // default로 선언된 클래스가 패키지 외부에서는 참조할 수 없다(확인)
		 // Person p1 = new Person();

	} // main
	*/
	
} // class
