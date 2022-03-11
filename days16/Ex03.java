package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오전 10:50:13
 * @subject P291 생성자(Constructor)
 * @content
 * 		
		 * [생성자]
		 * 1. 생성자 정의 : 메서드
		 * 2. 생성자의 역할 : 인스턴스 초기화 == 인스턴스 변수(필드)를 초기화하는 것 
		 * 3. 생성자 호출 시기 : 인스턴스 생성될 때 자동으로 호출
		 * 						 생성자는 강제로 호출 X
		 * 						 (즉, new MyPoint(); 이 코딩이 실행될 때 생성자가 호출된다)	
		 * 4. 생성자의 리턴값 : 리턴값이 없음(단, 아무것도 적지 않는다. void 사용 X)
		 * 5. 생성자 이름 == 클래스 이름(동일해야한다)
		 * 6. 접근지정자 4가지 사용 가능
		 * 7. 매개변수가 없는 생성자를 디폴트 생성자(Default Constructor)라고 부른다.
		 * 8. 생성자는 오버로딩 가능
		 * 9. 클래스에 선언된 생성자가 하나도 없는 경우에만 컴파일러가 자동으로 디폴트 생성자를 추가해준다.
		 * 10. 생성자는 상속되지 않는다.
		 * 
 */
public class Ex03 {

	public static void main(String[] args) {

		MyPoint p1;         // p1 객체(참조변수) 선언
		// 에러 메시지 : The constructor MyPoint(int, int) is undefined
		// 해석 :         생성자         MyPoint 선언되지 않았다. -> 사용할 수 없다.
		p1 = new MyPoint(10, 20); // 인스턴스 생성 -> 자동으로
								  // 객체 생성(인스턴스 생성), Heap영역에 인스턴스가 생성이 되어 p1이 인스턴스의 주소값을 참조한다.
		
		// 필드 초기화
		// p1.setX(10);
		// p1.setY(20);
		
		p1.dispPoint();

	} // main

} // class
