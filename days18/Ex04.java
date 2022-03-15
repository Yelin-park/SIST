package days18;

/**
 * @author Yelin
 * @date 2022. 3. 15. - 오전 10:40:08
 * @subject  p347 abstract 키워드
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// [abstract 키워드]
		// abstract 기타제어자를 붙여서 선언한 몸체가 없는 불완전한 메서드를 "추상메서드"라고 한다.
		// 왜? 추상메서드를 선언하고 사용하는가?
		// 답) Employee 클래스에는 getPay() 메서드 선언 X -> 자식 클래스인 R, S, T에는 getPay() 메서드 선언했지만 호출이 불가능
		//	   Employee 클래스에는 getPay() 메서드가 필요없지만 사용하기 위해서 뼈대만 생성하는 것
		
		
		// E - getPay() 급여 계산하는 메서드 X
		// R - getPay() <- S - 재정의 getPay()
		// T - getPay() 재정의 getPay()
		// 각 직원의 특성마다 급여 계산식이 다르기 때문에 getPay() 메서드를 Employee 클래스에 선언 X
		// Ex04 수업 시간에 Employee 클래스에 getPay() 메서드 선언
		
		// 다형성 E = R, E = S, E = T 
		//        dispEmpInfo() 호출 가능
		//  	  getPay() 호출 가능 X
		
		// 추상클래스		클래스	  -> 업캐스팅가능
		// Employee emp2 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);

	} // main

} // class
