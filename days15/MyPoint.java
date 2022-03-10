package days15;

// 좌표를 다루는 속성과 기능이 구현된 클래스
public class MyPoint {

	// 필드
	public int x;
	public int y;
	
	// 메서드
	public void dispPoint() {
		System.out.printf("> x = %d, y = %d\n", x, y);
	} // dispPoint

	// 호출한 객체, 메서드명(기본형 매개변수)
	// p1.offsetPoint(5);
	public void offsetPoint(int pos) {
		// p1의 필드 x
		// p1의 필드 y
		x += pos;
		y += pos;
		
	} // offsetPoint

	// 호출한 객체명.메서드명(참조형 매개변수)
	// p1.plusPoint(p2);  ->
	public void plusPoint(MyPoint p2) {
		// 그냥 x라고 해도 이것은 plustPoint() 메서드를 호출한 객체(p1)의 필드 x 이다. 즉, p1.x가 되어진다. p1.plusPoint(p2)
		x += p2.x;  
		y += p2.y;
		
	}
	
} // MyPoint
