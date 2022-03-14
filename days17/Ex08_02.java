package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 3:27:24
 * @subject [업캐스팅, 다운캐스팅] 개념 설명
 * @content 업캐스팅 : 자식 객체를 생성해서 부모 객체에 참조시키는 것(자동형변환 가능)
 * 			다운캐스팅 : 부모 객체를 다시 자식 객체에 참조시키는 것(자동형변환X, 강제형변환)
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 클래스들간의 형변환 : upcasting / downcasting - 상속 관계가 있어야 된다.
		// [상속 계층도]
		// 	  Object
		//	    ↑
		//	 Employee
		//      ↑
		//   Regular
		
		// long l = 100; // 자동형변환
		// 왜? Regular(정규직, 자식) 객체를 생성해서 왜? Employee(사원, 부모) 객체에다가 참조시키느냐???!
		// 클래스 형변환(조건 : Employee와 Regular 상속관계)
		// 자식 객체 생성해서 부모 객체에 참조 시키는 것을 "업캐스팅(upcasting)"이라고 한다.
		// 업캐스팅은 자동형변환된다. (Regular 객체가 Employee 객체가 된다.)
		// 설명 : 정규직도 사원이다. is-a 관계
		Employee emp2 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		
		// 체크사항 ? 왜? Regular 클래스 안에 있는 오버라이딩(재정의)한 메서드가 호출되는가??
		emp2.dispEmpInfo(); // 이유는 모르지만 재정의된 Regular.dispEmpInfo() 메서드 호출이 된다(기본급도 출력이 되더라) => 암기
		
		// 에러메시지 : The method getPay() is undefined for the type Employee
		// Employee 클래스 안에 getPay() 메서드가 없기 때문에 호출 X
		// Regular에 getPay()가 있지만 사용할 수 없음
		// System.out.println(emp2.getPay());
		
		// Employee라는 부모 객체(emp2)를 다시 자식 객체(emp3)에 참조시키자 "다운캐스팅(downcastin)"
		// 자동형변환이 되지 않는다 -> 강제형변환 cast 연산자
		Regular emp3 = (Regular) emp2; 
		

	} // main

} // class
