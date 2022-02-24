package days08;

/**
 * @author Yelin
 * @date 2022. 2. 24. - 오후 3:33:14
 * @subject Call By Reference p261, 264
 * @content
 * 			Heap 동적 영역에 있는 주소(실제 값이 있는 곳)를 main과 swap의 Stack 영역이 참조(주소 참조)를 하게되어 같은 값을 가지게 된다.
 * 			swap 함수는 실행 후 swap Stack 영역에 있는 값은 사라지고 main에 Stack 영역에 있는 값만 남게 된다.
 * 	
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		// 배열을 통해 값을 초기화
		int[] m = {10, 20};
		// 스택영역  힙영역(10, 20)
		
		// 힙영역과 스택에 동시에 저장이 되고
		// [10][20]     [시작주소참조]m
		// 시작주소        100번지
		
		// swap 메서드에서는 주소를 통해 실제 값을 찾아 오는건가요
		// swap(m) : m 참조형(배열) 매개변수로 메서드 호출 방법 : Call By Reference
		// swap(100번지)
		
		// void swap(int[] m) { [100번지]m }
		
		System.out.printf("x=%d, y=%d\n", m[0], m[1]); 
		// 실제 값으로 호출하는 Call By Value 로는 실행 X -> 참조형 Call By Reference
		swap(m);  // 참조형(배열, 클래스 인터페이스)을 매개변수로 메서드 호출 : Call By Reference
		System.out.printf("x=%d, y=%d\n", m[0], m[1]); 
	
	} // main

	
	public static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		
	}

	
	public static void swap(int x, int y) {
		System.out.printf("swap before x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("swap after x=%d, y=%d\n", x, y);
	}


} // class
