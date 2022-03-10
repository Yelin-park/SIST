package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오전 11:08:23
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// p234 [객체(인스턴스) 생성과 사용]
		// p235 진한글자 1,2,3,4,5 이해
		// p238 진한글자 1,2 이해
		// p239 진한글자 1,2,3,4 이해
		
		// 클래스? 객체의 설계도    					Tv
		// 객체? 클래스를 자료형으로 선언된 참조변수 	t1
		// 객체 선언
		// Tv t1; // 인스턴스 생성 x(new 연산자에 의해서 인스턴스가 생성되어짐)
		Tv t1 = null;
		
		// 에러1) null을 안주었을 때
		// 		에러메시지 : [The local variable t1] may not have been initialized
		// 		해석 : t1 지역변수가 초기화가 되지 않았다.
		// 에러2) null을 주었을 때
		// 		런타임 에러메시지 : NullPointerException  -> 클래스 사용할 때 가장 많이 나는 오류
		// t1.channel = 11;
	
		// 오류 발생하는 이유 : Heap 영역에 인스턴스가 생성되지 않아서
		// 해결: 인스턴스 생성
		t1 = new Tv();  // new Tv();  =>  인스턴스화(객체 생성)하는 코딩
		// new 연산자로 인해 Heap 영역에 Tv 객체를 생성하고 =을 통해 주소값을 참조해라
		
		// 필드를 초기화X -> 필드를 초기화하지 않아도 각 자료형의 기본값으로 초기화가 되어져 있다.
		System.out.println(t1.channel); // int 기본값 0
		System.out.println(t1.power);   // boolean 기본값 false
		System.out.println(t1.color);   // String 기본값 null (참조타입)
		
		// 객체명.필드명 == 11;
		t1.channel = 11;
		
		// 객체명.메서드명();
		t1.power();
		
		
		/*
		 * NullPointerException
		 * int[] m = null;
		 * m[0] = 100;
		 */

	} // main

} // class
