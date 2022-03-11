package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 3:47:21
 * @subject p300 ~ p307 변수의 초기화
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 1. 변수의 초기화? 변수를 선언하고 처음으로 값을 저장(할당)하는 것
		 * 
		 * 2. 지역변수 					 - 초기화 X > 에러 발생(반드시 초기화를 해야지만 사용할 수 있다)
		 * 	  인스턴스 변수, 클래스 변수 - 초기화 X > 각 자료형의 기본값으로 초기화
		 * 
		 * 3. p300 각 타입의 기본값 표
		 * 	  boolean  							  false
		 * 	  int, short, byte 			 		  0
		 * 	  float, double     				  0.0f  0.0(0.0d)
		 * 	  char    							  '\u0000'
		 *    참조타입(배열, 클래스, 인터페이스)  null
		 *    
		 * 4. 필드(멤버변수) 초기화 방법
		 * 		ㄱ. 명시적 초기화
		 * 		ㄴ. 생성자
		 * 		ㄷ. 초기화 블럭
		 * 			1) 인스턴스 초기화 블럭
		 * 			2) 클래스 초기화 블럭	: 객체 생성과 상관없이 프로그램 시작할 때 딱 한 번만 실행 (static {} 실행)
		 * 
		 * 4-2. 명시적 초기화 -> 클래스 초기화 블럭(static {}) -> 초기화{} -> 생성자 초기화
		 * 						 프로그램 시작시 1번 실행         객체가 생성될 때 마다  초기화 {}, 생성자 초기화 실행
		 * 
		 */

		int i;
		i = 100; // i 변수의 초기화(처음 값을 할당)
		
		// 4-2 관련) 명시적 초기화 -> 생성자 초기화
		// Person p1 = new Person("야리니", 19, 0.04);
		// System.out.println(p1.name + "/" + p1.age + "/" + p1.rate); // 야리니/19/0.04
		// System.out.println("> 고유번호 : " + p1.serialNo);
		
		// 4-2 관련) 명시적 초기화  -> 초기화 블럭
		Person p1 = new Person();
		System.out.println("> 고유번호 : " + p1.serialNo);
		System.out.println(p1.name + "/" + p1.age + "/" + p1.rate); // 야리니/19/0.04

		
		
	} // main

} // class


class Person{
	
	// 필드(인스턴스변수, 클래스변수)
	// 1. 필드를 초기화하지 않으면 각 타입의 기본값으로 초기화 된다.
	// 2. 명시적 초기화? 클래스의 필드 선언 시 값을 할당하는 것을 명시적 초기화라고 한다.
	String name = "미상"; 		// 명시적 초기화
	int age = 20;	      		// 명시적 초기화
	static double rate = 0.02;  // 명시적 초기화
	
	int count; 		// 명시적 초기화 X
	// static int count;     // 클래스 변수로 선언하면 객체가 생성될 때 마다 count 값 증가
	int serialNo;	// 명시적 초기화 X
	
	
	{
		// [인스턴스 초기화 블럭] : 간단 명료하게 초기화할 목적으로 초기화 블럭 사용
		//						    모든 생성자에서 공통적으로 사용하는 코드를 주로 초기화할 때 사용(인스턴스 초기화 블럭안에 코딩하기)
		// 						    어떤 생성자를 이용하여 객체를 생성해도 무조건 인스턴스 초기화 블럭 안에 있는 코딩을 실행
		++count;  		 // 객체를 생성하면 count가 1 증가
		serialNo = count;
	}
	
	static {
		// [클래스 초기화 블럭] : 클래스 변수 초기화				  
		rate = 0.07;
	}

	
	// 디폴트 생성자
	public Person() {
		// ++count;  		 // 객체를 생성하면 count가 1 증가
		// serialNo = count;
	}
	
	// 생성자 3
	public Person(String name, int age, double rate) {
		// ++count;  		 // 객체를 생성하면 count가 1 증가
		//serialNo = count;
		
		this.name = name;
		this.age = age;
		this.rate = rate;
	}
	
	// 메서드
	
	
} // Person class
