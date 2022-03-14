package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 12:40:08
 * @subject 
 * @content 
 * 			- p323 단일 상속 vs 다중 상속(자바는 다중 상속은 지원하지 않음) - Ex06의 원클래스 참고
 * 				why?? B와 C가 A를 상속받았는데 D가 B,C를 상속받으면 a1이 2번 상속되어지기 때문에
 *		  			A {
 *		  				a1;
 *		  			}
 *		  
 *		  			B extends A {
 *		  		    // a1
 *		  			   b1;
 *		  			}
 *		  
 *		  			C extends A{
 *		  			 // a1
 *		  				b1
 *		 			}
 *		 
 *		   		D extends B, C{
 *		  			    B의 a1
 *		  				C의 a1
 *		 			}
 * 
 * 
 * 			- p325 Object 클래스 - 모든 클래스의 조상 : 모든 클래스의 최상위 부모(super) 클래스는 Object 클래스이다.
 * 				> 모든 클래스는 java.lang.Object 클래스를 상속받기 때문에 컴파일할 때 자동으로 extends.java.lang.Object로 처리
 * 
 * 				1. Employee 클래스 - 사원이라면 공통적으로 가지고 있어야할 멤버(속성==필드, 기능==메서드)
 * 				2. Employee 클래스를 상속받은 Regular 정규직 사원 클래스 - 정규직이라면 가지고 있어야할 멤버
 * 				3. Regular  클래스를 상속받은 SelesMan 영업직 사원 클래스 - 영업직이라면 가지고 있어야할 멤버
 * 				4. Employee 클래스를 상속받은 Temp 임시직 사원 클래스 - 임시직(일용직, 계약직)
 * 
 * 				위의 4개의 클래스로 다음과 같은 설명...
 * 				> 상속성 / 다형성* / super 키워드 / 업캐스팅, 다운캐스팅(Ex08_02) / 오버로딩, 오버라이딩 / 추상화(추상클래스, 추상메서드)* / 인터페이스* 등등
 * 
 * 
 * 			- p327 오버라이딩(overriding)         / 오버로딩(overloading)
 * 
 */
public class Ex08 {

	public static void main(String[] args) {
		// Employee emp = new Employee();
		// emp. 9개의 메서드()가 있다. -> 왜??
		// 		답) 모든 클래스는 java.lang.Object 클래스를 상속받기 때문에 컴파일할 때 자동으로 extends.java.lang.Object로 처리
		// 모든 클래스의 최상위 부모(super) 클래스는 Object 클래스이다.
		// 모든 객체는 9개의 메서드는 반드시 포함하고 있다.
		
		// 1. 사원 객체 선언 및 생성
		Employee emp1 = new Employee("야리니", "서울시 마포구", "010-1234-5678", "2018-12-22");
		// 2. 사원 정보 출력
		emp1.dispEmpInfo();
		
		
		// 3. 정규직 사원 객체 선언 및 생성
		// 에러메시지 : The constructor Regular(String, String, String, String, int) is undefined
		// 해석 :  생성자가 하나도 없다.  -> Regular 클래스에 생성자 선언
		Regular emp2 = new Regular("김태우", "서울 영등포구", "010-2342-4423", "2019-03-05", 3000000);
		emp2.dispEmpInfo(); // 메서드도 상속된 것을 확인
		
		// 4. 생성자가 호출되는 순서 이해(암기)
		//	1) 부모 객체가 먼저 생성되기에 부모의 생성자가 먼저 호출되고 	> Employee 생성자 4 호출됨.
		//	2) 자식 객체가 생성된다.									  	> Regular 생성자 5 호출됨.
		
		// 5. 문제점
		// 	정규직 사원 클래스는 pay(기본급) 정보가 추가되어져 있지만 출력 X
		// 	Employee 클래스의 dispInfo()
		// 	사원명 : 김태우, 사원주소 : 서울 영등포구, 연락처 : 010-2342-4423, 입사일자 : 2019-03-05
		// 5-2. 문제점 해결
		//	ㄱ. 부모에게서 물려받은 메서드를 수정 -> 기본급을 포함해서 출력할 수 있도록  - [오버라이딩(overriding)] == 메서드재정의
		//	ㄴ. 메서드를 똑같은 이름으로 중복선언하는 방법								 - [오버로딩(overloading)]
		
		// Ex08_02.java
		// [업캐스팅, 다운캐스팅] 개념 설명


	} // main

} // class
