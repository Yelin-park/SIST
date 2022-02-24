package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 3:33:14
 * @subject 제어문 + 연산자 + [메서드 선언+호출] 응용/활용 예제
 * @content
 * 			메서드를 매개변수를 사용해서 호출할 때의 방법
 * 			1) Call By Name		 - 매개변수는 없이 메서드 이름만 가지고 메서드를 호출하는 방법(ex. drawLine)		
 * 			2) Call By Value     - 매개변수에 실제 값(Value)을 가지고 메서드를 호출하는 방법(ex. drawLine(n) / (ex. drawLine(30))	
 *			3) Call By Point	 - 자바에서 사용 X(C에서만 사용)
 *			4) Call By Reference - 참조형(배열, 클래스, 인터페이스)을 가지고 메서드를 호출하는 방법 -> 다룬 적이 없어 확인을 못함
 * 			
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 두 기억공간의 값을 교환
		int x = 10, y = 20;
		System.out.printf("x=%d, y=%d\n", x, y); // x=10, y=20
		
		// [문제] 두 개의 값을 교환하는 메서드(swap)를 선언하고, 호출
		swap(x, y);  // 10, 20 값 전달 메서드를 호출(Call By Value)
		
		System.out.printf("x=%d, y=%d\n", x, y); // x=20, y=10
	
	} // main

	
	public static void swap(int x, int y) {
		System.out.printf("swap before x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("swap after x=%d, y=%d\n", x, y);
	}

} // class
