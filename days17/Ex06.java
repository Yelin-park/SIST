package days17;

/**
 * @author Yelin
 * @date 2022. 3. 14. - 오후 12:24:13
 * @subject p318 - p319 예제 7-2
 * @content p321 예제 7-3 해보기
 */
public class Ex06 {

	public static void main(String[] args) {
		// 객체(클래스) 배열 초기화
		Point[] p = {
				new Point(1,1),
				new Point(10, 100),
				new Point(120, 15)
		};
		
		//                생성자 DI(생성자를 통해서 객체 주입)
		Triangle t = new Triangle(p);

	} // main

} // class


// 삼각형, 사각형, 원, 마름모 등등
class Shape {
	// 필드
	String color = "black";
	
	// 메서드
	void draw() {
		System.out.printf("[Color = %s]\n", this.color);
	}
} // Shape class

// 좌표 클래스
class Point {
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
} // Point class

// 원 클래스
// > 자바는 다중상속을 할 수 없다(부모 클래스는 딱 한 개여야 된다)
// 		class Circle extends Shape extends Point{ // 문법 에러
// 		class Circle extends Shape, Point{ // 문법 에러
class Circle extends Shape{
	// 원점 (어쩔 수 없이 has-a 관계를 가질 수 밖에 없음) > 다중상속을 할 수 없기 때문에
	Point center;                   // Point center = new Point(); // 좋은 코딩은 아님
	int r; // 반지름
	
	// 디폴트 생성자 DI
	Circle() {
		this(new Point(0,0) , 100);
	}
	
	// 생성자 DI
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
} // Circle class

// 삼각형 클래스
class Triangle extends Shape{
	// 점3
	Point[] p = new Point[3];  // 객체 배열 선언 코딩 -> main() 메서드에서 인스턴스 생성
	
	public Triangle(Point[] p) {
		this.p = p;
	}
} // Triangle class

// 사각형 클래스
class Rectangle extends Shape{
	// 점4
	Point[] p = new Point[4];
	
	public Rectangle(Point[] p) {
		this.p = p;
	}
} // Rectangle class

