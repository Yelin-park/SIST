package days15;

/**
 * @author Yelin
 * @date 2022. 3. 10. - 오후 12:13:18
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// int x = 10, y = 20;
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		// System.out.printf("x = %d, y = %d\n", p1.x, p1.y);
		p1.printPoint();
		
		// 두 기억 공간의 값을 바꾸는 swap() 메서드 선언해서 코딩을 수정(days08.Ex05_02)
		// 원인 : Call By Value
		// 해결 : 매개변수를 참조형으로 넣어야 해결 -> Call By Reference(클래스)
		// swap(x,y); 
		
		swap(p1);
		// System.out.printf("x = %d, y = %d", p1.x, p1.y);
		p1.printPoint();
		
	} // main

	// 								클래스 자료형의 매개변수 선언
	private static void swap(Point p1) {
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
		
	} // swap
	
	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
	} // swap

} // class


// 하나의 자바 파일(Ex04_02.java) 안에 여러 개의 클래스를 선언할 수 있다.
// public으로 선언된 클래스는 반드시 1개, public으로 선언된 클래스명 == 파일명.java

// 에러메시지 : The public type Point must be defined in its own file
// 해석 : 접근지정자 public으로 선언된 Point라는 클래스 타입은 자체 파일에 정의되어야 한다.
// 해결방법 : public 접근지정자를 빼야함    
// public class Point{
class Point{
	// 클래스 필드(field) ==  속성 == 멤버변수
	public int x;
	public int y;
	
	// 메서드(method)
	public void printPoint() {
		System.out.printf("x=%d, y=%d\n", x, y);
	}
	
} // Point
