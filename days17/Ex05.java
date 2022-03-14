package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 12:08:17
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 생성자와 초기화 블럭은 상속되지 않는다.
		// has-a 관계(포함관계) p316
		// Circle - Point 관계 
		// Car - Engine 관계

	} // main

} // class

/*
// 원 클래스 is-a 관계
class Circle extends Point{
	// [필드]
	// 원점
	// int x;
	// int y;

	// 반지름
	int r;

} // Circle
*/

/*
// 원 클래스 has-a 관계(포함관계)
// Circle 클래스는 Point 클래스를 가지고 있다.
class Circle{
	// [필드]
	// 원점
	// int x;
	// int y;
	Point 원점 = null;
	// 반지름
	int r;
	
	Circle() {
		원점 = new Point();
	}
	
	Circle(Point p){
		this.원점 = p;
	}
	
	//
} // Circle
*/

/*
// 좌표점 클래스
class Point{
	// 필드
	int x;
	int y;

	// 디폴트 생성자
	Point() {
		this(0, 0);  // this의 두번째 용도 : 생성자에서 또 다른 생성자를 호출할 때의 this
	}
	
	// 생성자
	Point(int x, int y){
		this.x = x; // this의 첫번째 용도 : 멤버(필드, 메서드)를 가리킬 때의 this
		this.y = y;
	}
	
	// 메서드
	String getXY() {
		return String.format("(%d, %d)", x, y);
	}
	
} // Point
*/