package days18;

import days17.Regular;
import days17.SalesMan;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 12:18:08
 * @subject p356 클래스간의(참조변수) 형변환
 * @content
 * 
 * 			p353 제어자 조합해서 사용시 주의사항
 */
public class Ex07 {

	public static void main(String[] args) {
		// [p356 클래스간의 형변환]
		// Employee / Regular (형변환 조건 : 상속관계)
		// 업캐스팅 : 부모 obj = new 자식객체();  -> 자동형변환
		// 다운캐스팅 -> 강제형변환 cast 연산자를 사용해서
		
		// [문제] 왜 형변환(다운캐스팅)이 안되는지? 업캐스팅을 한 객체를 다운캐스팅 가능(부모가 자식이 될 수 없음)
		// 부모객체 생성 -> 자식객체로 형변환
		// Regular r = new Regular();	  // 부모
		
		// 업캐스팅이 된 후에 다운캐스팅 가능하다.
		Regular r = new SalesMan();
		
		// java.lang.ClassCastException: days17.Regular cannot be cast to days17.SalesMan
		SalesMan s = (SalesMan) r;  
		System.out.println("END");

	} // main
	
	// [p353 제어자 조합해서 사용시 주의사항]
	// static : 객체를 생성하지 않고 사용하는
	// abstract : 몸체가 구현되지 않은 불완전한 
	// 1. public [static abstract] void disp() {}
	
	// final : 재정의 할 수 없음
	// abstract : 재정의를 해야함
	// 2. public [final abstract] void disp() {}
	
	// private : 그 클래스 안에서만 접근 가능
	// abstract : 자식클래스에서 재정의를 해야함
	// 3. [private abstract] void disp() {}
	
	// 4. private와 final을 같이 쓸 필요 X

} // class
