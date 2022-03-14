package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 3:48:04
 * @subject
 * @content 
 * 		// [상속 계층도]
		// 	  Object
		//	    ↑
		//	 Employee
		//      ↑
		//   Regular
		//      ↑
		//   final SalesMan(영업직) 사원 클래스
		
		/*
		 * final 붙는 경우 3가지
		 * 1) final 클래스 선언(subclass를 가질 수 없는 최종 클래스) ex.SalesMan 클래스
		 * 2) final 변수 선언(상수 : final은 상수 -> 한번 초기화하면 값을 바꿀 수 없음)
		 * 3) final 메서드 선언(subclass에서 오버라이딩 할 수 없다.)
		 * 
		 * 자바는 모든 부모 클래스의 인스턴스 메서드를 자식 클래스에서 재정의 할 수 있다.(오버라이딩이 가능하다)
		
 */
public class Ex08_03 {
	
	// [필드]
	// 상수 필드
	public final static double PI = 3.141592;
	
	// 에러메시지 : The blank final field MAX_VALUE may not have been initialized
	// final 멤버변수는 꼭 초기화 값을 할당해 주어야함(명시적 초기화이던 생성자 안에던)
	public final int MAX_VALUE;
	
	// 생성자
	Ex08_03() {
		MAX_VALUE = 100;
		
	}

	public static void main(String[] args) {
		
		// 지역변수 : 접근지정자 붙이면 X
		// 에러메시지 : Illegal modifier for parameter PI; only final is permitted
		// final double PI = 3.141592;
		
		// disp(100);
		
		// 생성자 호출 순서 기억(암기) 
		// > Employee 생성자 4 호출됨. > Regular 생성자 5 호출됨. > SalesMan 생성자 7 호출됨.
		/*
		SalesMan emp4 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		emp4.dispEmpInfo(); 				// 판매량, 커미션까지 정보 출력
		System.out.println(emp4.getPay()); // 기본급 + 판매량 * 커미션
		*/
		
		// Regular 업캐스팅(자동형변환)
		/*
		Regular emp4 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		emp4.dispEmpInfo(); 				// 판매량, 커미션까지 정보 출력 -> SalesMan의 dispEmpInfo() 메서드 호출
		System.out.println(emp4.getPay()); // 기본급 + 판매량 * 커미션
		*/
		
		// Employee.dispEmpInfo() 호출 -> SalesMan.dispEmpInfo() 재정의된 메서드가 호출된다.
		Employee emp4 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		emp4.dispEmpInfo(); 				  // 기본급, 판매량, 커미션까지 정보 출력
		// System.out.println(emp4.getPay()); // Employee 클래스 안에 getPay() 메서드가 없기 때문에 호출 X

	} // main

	// final int i를 매개변수로 넣으면 i 값을 바꿀 수 없음 why? final 상수이기때문
	private static void disp(int i) {
		i += 1000;
		System.out.println("i = " + i); // i = 1100 (생성자에서 초기화 값으로 100을 주었기 때문에)
	}

} // class
