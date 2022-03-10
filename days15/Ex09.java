package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 3:55:35
 * @subject p264 기본형 매개변수와 참조형 매개변수
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// MyPoint 클래스 추가
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		p1.dispPoint(); // > x = 10, y = 20
		
		// 내가 준 값만큼 x,y를 이동시키는 메서드
		// 기본형 int 5 == 기본형 매개변수
		p1.offsetPoint(5);
		
		p1.dispPoint(); // > p1의 x = 15, y = 25
		
		MyPoint p2 = new MyPoint();
		p2.x = 1;
		p2.y = 2;
		
		// 클래스 타입의 p2 매개변수(MyPoint p2) == 참조형 매개변수
		p1.plusPoint(p2);
		// p1.x = p1.x + p2.x
		// p1.y = p1.y + p2.y
		
		p1.dispPoint(); // > x = 16, y = 27

	} // main

} // class
