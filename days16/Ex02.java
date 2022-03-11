package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오전 9:49:23
 * @subject private로 선언된 필드 x에 접근하는 방법? [getter / setter] 이해, 설명
 * @content private 멤버(필드)에 접근할 수 있는 방법을 제공하는 메서드이다.
 * 			
 * 			[질문] getter/setter는 어떤 상황에 주로 사용하는가?
 * 				   private를 다른 접근자로 변경하지않고 getter/setter를 사용하는 이유가 궁금합니다.
 * 				이유 1) 쓰기 전용/ 읽기 전용의 멤버를 선언하고자 할 때..(쓰기만 하고싶으면 : setter, 읽기만 하고싶다 : getter)
 * 				이유 2) 유효한 값을 멤버(필드)에 할당하고자 할 때..(가져오고자 할 때) (매번 물어보는 것보다 한 번만 물어보고 입력 받는 것이 좋은 코딩)
 */			
public class Ex02 {

	public static void main(String[] args) {
		// 1. MyPoint 클래스 선언
		
		// 2. p1 객체 선언 및 생성
		
		// Ex03으로 인한 에러 메시지 : The constructor MyPoint() is undefined
		// 해석 : 생성자가 선언되지 않았다.
		// 매개변수가 없는 생성자를 디폴트 생성자라고 부른다.
		MyPoint p1 = new MyPoint();
		
		// 3. p1 객체의 멤버(필드) 값 설정
		// 에러메시지 : The field MyPoint.y [is not visible] > 보이지 않는다.
		// 원인 : 접근지정자 때문이다. -> private 접근지정자 사용해서 에러 발생 -> 접근 가능하도록 하려면? 접근지정자를 변경
		
		// 4. private로 선언된 필드 x에 접근하는 방법? getter / setter
		// p1.x = 10;
		p1.setX(10);
		System.out.println(p1.getX());
		
		p1.setY(20);
		System.out.println(p1.getY());
		
		p1.dispPoint();

	} // main

} // class
