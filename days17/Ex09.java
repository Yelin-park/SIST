package days17;

public class Ex09 {

	public static void main(String[] args) {
		// 1. 사원 객체 선언 및 생성
		Employee emp1 = new Employee("야리니", "서울시 마포구", "010-1234-5678", "2018-12-22");
		// 2. 사원 정보 출력
		emp1.dispEmpInfo();
		
		// 3. 정규직 사원 객체 선언 및 생성
		// 에러메시지 : The constructor Regular(String, String, String, String, int) is undefined
		// 해석 :  생성자가 하나도 없다.  -> Regular 클래스에 생성자 선언
		Regular emp2 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		emp2.dispEmpInfo(); // 메서드도 상속된 것을 확인
							// 체크사항 ? 왜? Regular 클래스 안에 있는 오버라이딩(재정의)한 메서드가 호출되는가??
							// 이유는 모르지만 재정의된 Regular.dispEmpInfo() 메서드 호출이 된다(기본급도 출력이 되더라) => 암기
		
		// 에러메시지 : The method getPay() is undefined for the type Employee
		// Employee 클래스 안에 getPay() 메서드가 없기 때문에 호출 X ->  Regular에 getPay()가 있지만 사용할 수 없음
		// System.out.println(emp2.getPay());
		
		// Employee라는 부모 객체(emp2)를 다시 자식 객체(emp3)에 참조시키자 "다운캐스팅(downcastin)"
		// 자동형변환이 되지 않는다 -> 강제형변환 cast 연산자
		Regular emp3 = (Regular) emp2;
		
		// 업캐스팅(자동형변환)
		// Employee.dispEmpInfo() 호출 -> SalesMan.dispEmpInfo() 재정의된 메서드가 호출된다.
		Employee emp4 = new SalesMan("한석봉", "서울시 송파구", "010-1588-1119", "2017-01-12", 500000, 20, 75000);
		emp4.dispEmpInfo(); 				  // 기본급, 판매량, 커미션까지 정보 출력
		// System.out.println(emp4.getPay()); // Employee 클래스 안에 getPay() 메서드가 없기 때문에 호출 X
		
		// 업캐스팅(자동형변환)
		Employee emp5 = new Temp("박나래", "경기도 과천시", "010-8282-8282", "2020-04-09", 21, 100000);
		emp5.dispEmpInfo(); // Temp.dispEmpInfo() 재정의된 메서드가 호출된다.
		// System.out.println(emp5.getPay()); // Employee 클래스 안에 getPay() 메서드가 없기 때문에 호출 X
		
	} // main

} // class
