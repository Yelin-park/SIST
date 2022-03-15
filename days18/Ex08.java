package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오후 12:34:02
 * @subject p362 instanceof 연산자 + p367 매개변수의 다형성
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// 
		Regular emp1 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		SalesMan emp2 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		Temp emp3 = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		
		// 사원의 급여를 출력하는 메서드 호출
		printEmpPay(emp1);
		printEmpPay(emp2);
		printEmpPay(emp3);
		// printEmpPay(new Temp2());
		// Employee <- Temp <- class Temp2
		
	} // main
	
	// [매개변수의 다형성]
	// Employee emp = Regular; // 자동 업캐스팅
	// Employee emp = SalesMan;
	// Employee emp = Temp;
	private static void printEmpPay(Employee emp) {
		// R/S/T 어떤 객체인지 파악해서 코딩 : 그 객체가 어떤 클래스 타입의 인스턴스인지 확인하는 연산자가 [instanceof 연산자]
		// [주의할점] true/false 결과 값을 돌려주는 객체 instanceof 클래스타입 연산자
		// 	1) if~else if문 사용을 하여 하나라도 조건을 만족하면 빠져나가도록 코딩
		// 	2) 자식 클래스를 먼저 체크한다. 
		//	3) 확인을 한 후 다운캐스팅 처리한다.
		if( emp instanceof SalesMan) {
			System.out.println("영업직 사원");
			// 다운캐스팅 코딩처리
			SalesMan s = (SalesMan)  emp;
		}
		else if( emp instanceof Regular) System.out.println("정규직 사원");
		else if( emp instanceof Temp) System.out.println("임시직 사원");
		
		System.out.println("> 사원급여 : " + emp.getPay()); // 다형성 == 실제 객체의 급여를 계산해라
	}
	
	// 오버로딩
	/*
	private static void printEmpPay(Regular emp) {
		System.out.println("> 정규직 사원급여 : " + emp.getPay());
	}
	
	private static void printEmpPay(SalesMan emp) {
		System.out.println("> 영업직 사원급여 : " + emp.getPay());
		
	}
	
	private static void printEmpPay(Temp emp) {
		System.out.println("> 임시직 사원급여 : " + emp.getPay());
		
	}
	*/

} // class
