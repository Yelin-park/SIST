package days16;

/**
 * @author Yelin
 * @date 2022. 3. 11. - 오후 12:14:30
 * @subject P295 5.4 생성자에서 다른 생성자 호출하기 - this(), this ****
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 1. this는 키워드(예약어)
		 * 
		 * 2. 정의? 클래스 자기 자신의 주소값을 갖는 참조변수(== 객체 == p1)
		 * 			객체(인스턴스) 생성이 되어야 주소값을 가질 수 있음
		 * 
		 * 3. this의 3가지 사용용도
		 *   1) 힙 영역에 올라가 있는 인스턴스(클래스 자기 자신)의 멤버를 가리킬 때의 this
		 *      this.y = y;
		 *      this.y  => 멤버변수인 필드를 가리키는 용도
		 *      y       => 생성자의 매개변수 y  MyPoint(int x, int y)
		 *      
		 *   2) 생성자에서 또 다른 생성자를 호출할 때의 this
		 *   	MyPoint 클래스 참고하기
		 *   
		 *   3) 단독으로 사용될 때의 this - 리턴값, 매개변수로 사용될 때    =>    매개변수는 상속 수업할 때 설명
		 *   
		 */
		
		// MyPoint p1 = new MyPoint(10, 20);
		
		MyPoint p1 = new MyPoint(10);
		p1.dispPoint(); // > x = 10, y = 100
		
		p1.offSetPoint(5);
		p1.dispPoint(); // > x = 15, y = 105
		
		MyPoint p2 = new MyPoint(1, 2); 
		p1.offSetPoint(p2);
		
		p1.offSetPoint(p2).dispPoint(); // MyPoint 클래스 안에 있는 메서드의 return이 p면 p2의 값을, this이면 p1의 값을 돌려준다.
		
		// 위의 코딩을 아래처럼 코딩을 해도 됨
		p1
			.offSetPoint(p2)
			.dispPoint();
			
		
		p1.dispPoint(); // > x = 16, y = 107
		
		
		

	} // main

} // class
